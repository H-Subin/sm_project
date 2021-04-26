package com.example.sm_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.sm_project.CostSettingActivity;
import com.example.sm_project.LikepageActivity;
import com.example.sm_project.MainActivity;
import com.example.sm_project.R;
import com.example.sm_project.SettingActivity;

public class OwnerPageActivity extends AppCompatActivity {
    Button go_to_setting, go_to_ads, go_to_store_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
        Toolbar tb = (Toolbar) findViewById(R.id.mypage_toolbar);
        setSupportActionBar(tb);

        go_to_setting = findViewById(R.id.go_to_setting);
        go_to_ads = findViewById(R.id.go_to_ads);
        go_to_store_setting = findViewById(R.id.go_to_store_setting);

        go_to_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), SettingActivity.class));
                finish();
            }
        });

        go_to_ads.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), LikepageActivity.class));
                finish();
            }
        });

        go_to_store_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), CostSettingActivity.class));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplication(), MainActivity.class));
        finish();
    }
}
