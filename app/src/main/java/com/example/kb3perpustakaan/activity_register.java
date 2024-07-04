package com.example.kb3perpustakaan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class activity_register extends AppCompatActivity {

    DatabaseHelper db;
    EditText etRegUsername, etRegPassword;
    Button btnRegisterUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DatabaseHelper(this);
        etRegUsername = findViewById(R.id.etRegUsername);
        etRegPassword = findViewById(R.id.etRegPassword);
        btnRegisterUser = findViewById(R.id.etRegisterUser);

        btnRegisterUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etRegUsername.getText().toString();
                String password = etRegPassword.getText().toString();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(activity_register.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    boolean result = db.insertUser(username, password);
                    if (result) {
                        Toast.makeText(activity_register.this, "Registration successful " + username , Toast.LENGTH_SHORT).show();
                        finish();
                    } else {
                        Toast.makeText(activity_register.this, "Registration failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}