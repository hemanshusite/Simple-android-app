package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String tmkoc[]={"JethalalGada","Daya","Champakalal","Tapu","AatmaramBhide","Madhvi","sonu","Sodhi","Roshan","Gogi","HansrajHaathi","Komal","Goli","TaarakMehta","Angali","Iyer","Babita","Bagha","bavri","Natukaka","Abdul"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c=new CustomAdapter(tmkoc);
        recyclerView.setAdapter(c);
    }
}