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
        items.add(new Item("الصدر","هل انتم مستعدين لرحلة مثيرة من التمارين الصدر ؟ اطلعو علي تمارين الصدر الجدابة و القوه لدينا للحصول علي صدر مثالي ينبعت منه القوه و الثقة ",R.drawable.ic_launcher_foreground));
        items.add(new Item("الظهر","hhhh",R.drawable.ic_launcher_foreground));
        items.add(new Item("الارجل","hhhh",R.drawable.ic_launcher_foreground));
        items.add(new Item("عضلات المعدة","hhhh",R.drawable.ic_launcher_foreground));
        items.add(new Item("الاكتاف","hhhh",R.drawable.ic_launcher_foreground));
        items.add(new Item("الترابيس","hhhh",R.drawable.ic_launcher_foreground));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Myadabter(getApplicationContext(),items));
    }
}