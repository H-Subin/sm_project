package com.example.sm_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SellerSettingActivity extends AppCompatActivity {
    Spinner spinner_store, spinner_city, spinner_town;
    ArrayAdapter<CharSequence> stspin, adspin1, adspin2;
    CardView cardView_tag;
    EditText txt_name, txt_intro, txt_addr, txt_time;
    String town;
    TextView txt_tag_num;
    int tag_num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_setting);
        spinner_city = findViewById(R.id.spinner_city);
        spinner_town =  findViewById(R.id.spinner_town);
        spinner_store = findViewById(R.id.spinner_store_type);

        stspin = ArrayAdapter.createFromResource(this, R.array.store_type, android.R.layout.simple_spinner_dropdown_item);
        stspin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_store.setAdapter(stspin);

        adspin1 = ArrayAdapter.createFromResource(this, R.array.city, android.R.layout.simple_spinner_dropdown_item);
        adspin1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_city.setAdapter(adspin1);

        txt_tag_num = findViewById(R.id.txt_tag_num);
        txt_tag_num.setText("현재 "+tag_num+"개 선택됨");

        cardView_tag = findViewById(R.id.cardview_Tag);

        txt_name = findViewById(R.id.edittxt_shop_name);
        txt_addr = findViewById(R.id.edittxt_shop_addr);
        txt_time = findViewById(R.id.edittxt_shop_time);
        txt_intro = findViewById(R.id.edittxt_intro);

        SharedPreferences sf = getSharedPreferences("sFile",MODE_PRIVATE);

        //text라는 key에 저장된 값이 있는지 확인. 아무값도 들어있지 않으면 ""를 반환
        String name = sf.getString("name_key","");
        String addr = sf.getString("addr_key","");
        String intro = sf.getString("intro_key","");
        String time = sf.getString("time_key","");
        String type = sf.getString("type_key","");
        String city = sf.getString("city_key","");
        town = sf.getString("town_key","");
        txt_name.setText(name);
        txt_intro.setText(intro);
        txt_addr.setText(addr);
        txt_time.setText(time);
        spinner_store.setSelection(getIndex(spinner_store, type));
        spinner_city.setSelection(getIndex(spinner_city, city));


        spinner_city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selItem = (String) spinner_city.getSelectedItem();

                setSpinnerItemList(selItem);
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

    private void setSpinnerItemList(String selItem) {
        switch (selItem) {
            case "서울특별시":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Seoul, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;

            case "부산광역시":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Busan, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;

            case "대구광역시":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Daegu, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "인천광역시":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Incheon, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "대전광역시":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Daejeon, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "울산광역시":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Ulsan, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "세종특별자치시":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Sejong, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "경기도":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Gyeonggi, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "강원도":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Gangwon, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "충청북도":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Chungbuk, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "충청남도":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Chungnam, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "전라북도":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Jeonbuk, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "전라남도":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Jeonnam, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "경상북도":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Gyeongbuk, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "경상남도":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Gyeongnam, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            case "제주특별자치도":
                adspin2 = ArrayAdapter.createFromResource(SellerSettingActivity.this, R.array.Jeju, android.R.layout.simple_spinner_dropdown_item);
                adspin2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner_town.setAdapter(adspin2);
                spinner_town.setSelection(getIndex(spinner_town, town));
                break;
            default:
                break;

        }
    }

    private int getIndex(Spinner spinner, String item) {
        for(int i = 0 ; i<spinner.getCount(); i++){
            if(spinner.getItemAtPosition(i).toString().equalsIgnoreCase(item)){
                return i;
            }
        }
        return 0;
    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences sharedPreferences = getSharedPreferences("sFile",MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        String name = txt_name.getText().toString(); // 사용자가 입력한 저장할 데이터
        String addr = txt_addr.getText().toString(); // 사용자가 입력한 저장할 데이터
        String intro = txt_intro.getText().toString(); // 사용자가 입력한 저장할 데이터
        String time = txt_time.getText().toString(); // 사용자가 입력한 저장할 데이터
        String type = spinner_store.getSelectedItem().toString();
        String city = spinner_city.getSelectedItem().toString();
        String _town = spinner_town.getSelectedItem().toString();
        editor.putString("name_key",name);
        editor.putString("addr_key",addr);
        editor.putString("intro_key",intro);
        editor.putString("time_key",time);
        editor.putString("type_key",type);
        editor.putString("city_key",city);
        editor.putString("town_key",_town);


        editor.commit();
    }

}

