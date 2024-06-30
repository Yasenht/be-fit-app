package com.example.yas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recyclerview extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);
        items=new ArrayList<>();
        items.add("fires");
        items.add("2");
        items.add("3");
        items.add("4");
        items.add("5");
        items.add("6");
    recyclerView=findViewById(R.id.recyclerview);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    adapter=new Adapter(this,items);
    recyclerView.setAdapter(adapter);






    }
}
