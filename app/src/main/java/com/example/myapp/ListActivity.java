package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.list_view);

        String data[] = new String[] {"Jawa Timur", "Jawa Tengah", "Jawa Barat", "Yogyakarta", "Banten"};
        ArrayList <String> aList = new ArrayList <String> ();
        aList.add(data);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);

//        listView.setOnClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
//                String selectedItem = (String) parent.getItemAtPosition(position);
//                Toast.makeText(this, selectedItem, Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}
