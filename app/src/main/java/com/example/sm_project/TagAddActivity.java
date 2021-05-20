package com.example.sm_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class TagAddActivity extends Activity {
    Button btn_submit;
    ListView listView_tag;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_add);

        btn_submit = findViewById(R.id.btn_tag_submit);

        listView_tag = (ListView)findViewById(R.id.listView_tag);
        ArrayAdapter<CharSequence> adapterOfListViewLanguages = ArrayAdapter.createFromResource(
                this,
                R.array.tag_list,
                android.R.layout.simple_list_item_multiple_choice
        );
        listView_tag.setAdapter(adapterOfListViewLanguages);
        listView_tag.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        listView_tag.getCheckedItemIds();
        listView_tag.getCheckedItemPositions();

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SellerSettingActivity.class));
                finish();
            }
        });


    }
}