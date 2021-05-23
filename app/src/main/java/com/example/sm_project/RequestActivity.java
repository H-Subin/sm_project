package com.example.sm_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RequestActivity extends AppCompatActivity {
    fragment_seller_intro fragment_seller_intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        fragment_seller_intro = new fragment_seller_intro();

        getSupportFragmentManager().beginTransaction().replace(R.id.activity_request,fragment_seller_intro).commit();
    }
}