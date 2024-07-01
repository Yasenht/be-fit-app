package com.example.yas.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.yas.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.re);
        List<Item> items=new ArrayList<Item>();
        items.add(new Item("تمارين الرجلين"," ",R.drawable.ic_launcher_foreground));
        items.add(new Item(" تمارين الظهر","hhhh",R.drawable.ic_launcher_foreground));
        items.add(new Item("تمارين اليدين","hhhh",R.drawable.ic_launcher_foreground));
        items.add(new Item(" تمارين عضلات المعدة","hhhh",R.drawable.ic_launcher_foreground));
        items.add(new Item(" تمارين الاكتاف","hhhh",R.drawable.ic_launcher_foreground));
        items.add(new Item("الترابيس","hhhh",R.drawable.ic_launcher_foreground));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Myadabter(getApplicationContext(),items));
    }
}