package com.example.sm_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SellerSettingActivity extends AppCompatActivity {
    Spinner spinner_store, spinner_city, spinner_town;
    ArrayAdapter<CharSequence> stspin, adspin1, adspin2;
    CardView cardView_tag;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_setting);
        spinner_city = findViewById(R.id.spinner_city);
        spinner_town =  findViewById(R.id.spinner_town);
        spinner_store = findViewById(R.id.spinner_store_type);

        stspin = ArrayAdapter.createFromResource(this, R.array.store_type, android.R.layout.simple_spinner_dropdown_item);
        stspin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adspin1 = ArrayAdapter.createFromResource(this, R.array.city, android.R.layout.simple_spinner_dropdown_item);
        adspin1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_store.setAdapter(stspin);
        spinner_city.setAdapter(adspin1);

        cardView_tag = findViewById(R.id.cardview_Tag);

        spinner_city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selItem = (String) spinner_city.getSelectedItem();

                switch (selItem) {
                    case "서울특별시":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Seoul, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;

                    case "부산광역시":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Busan, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;

                    case "대구광역시":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Daegu, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "인천광역시":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Incheon, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "대전광역시":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Daejeon, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "울산광역시":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Ulsan, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "세종특별자치시":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Sejong, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "경기도":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Gyeonggi, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "강원도":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Gangwon, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "충청북도":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Chungbuk, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "충청남도":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Chungnam, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "전라북도":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Jeonbuk, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "전라남도":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Jeonnam, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "경상북도":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Gyeongbuk, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "경상남도":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Gyeongnam, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    case "제주특별자치도":
                        adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Jeju, android.R.layout.simple_spinner_dropdown_item);
                        adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner_town.setAdapter(adspin2);
                        break;
                    default:
                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        cardView_tag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), TagAddActivity.class));
                finish();
            }
        });
    }
}

