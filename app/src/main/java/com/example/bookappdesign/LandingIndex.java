package com.example.bookappdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LandingIndex extends AppCompatActivity {

    ListView listView;
    String[] mobileArray = {"Dashboard"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_index);

        listView = (ListView) findViewById(R.id.list_1);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.item_view, R.id.itemTextView, mobileArray);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String itemName = mobileArray[i];

                System.out.println(itemName);
                switch (itemName) {
                    case "Dashboard":
                        startActivity(new Intent(LandingIndex.this, Dashboard.class));
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}