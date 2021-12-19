package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[]={"Hemanshu","Saif","Hemant","Muskan","Sandeep.G"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
//        ArrayAdapter list =new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//        listView.setAdapter(list);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "You are in="+position, Toast.LENGTH_SHORT).show();
//            }
//        });
        HemanshuAdapter hd =new HemanshuAdapter(this,R.layout.my_hemanshu_layout,arr);
        listView.setAdapter(hd);
    }
}