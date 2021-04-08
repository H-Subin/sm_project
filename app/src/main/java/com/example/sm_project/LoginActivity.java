package com.example.sm_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    Button login_btn, join_btn;
    TextView id, pass, wng_tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        login_btn = findViewById(R.id.login_btn);
        join_btn = findViewById(R.id.join_btn);
        id = findViewById(R.id.login_id);
        pass = findViewById(R.id.login_passward);
        wng_tb = findViewById(R.id.warning_text);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), NavActivityActivity.class));
                finish();
            }
        });

        join_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), JoinActivity.class));
                finish();
            }
        });


    }
}