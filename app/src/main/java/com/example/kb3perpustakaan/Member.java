package com.example.kb3perpustakaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Member extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_member);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void profile(View view) {
        Intent intent = new Intent(Member.this, profil.class);
        startActivity(intent);
    }
    public void profile2(View view) {
        Intent intent = new Intent(Member.this, profile2.class);
        startActivity(intent);
    }
    public void profile3(View view) {
        Intent intent = new Intent(Member.this, profile3.class);
        startActivity(intent);
    }
    public void profile4(View view) {
        Intent intent = new Intent(Member.this, profile4.class);
        startActivity(intent);
    }
}