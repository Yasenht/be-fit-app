package com.example.yas.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yas.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    List<Item> items=new ArrayList<Item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.re);
        TextView text = findViewById (R.id.textbe);
        ImageView rigth=findViewById(R.id.leftj);
        ImageView left=findViewById(R.id.left);
        items.add(new Item("تمارين الساقين","انقر للعرض ",R.drawable.a));
        items.add(new Item(" تمارين الكتف و الظهر","انقر للعرض",R.drawable.shoulder));
        items.add(new Item("تمارين اليدين","انقر للعرض",R.drawable.arm_exercises));
        items.add(new Item(" تمارين عضلات البطن","انقر للعرض",R.drawable.abdominal_muscles));
        items.add(new Item(" تمارين الاكتاف","انقر للعرض",R.drawable.a));
        items.add(new Item("الترابيس","انقر للعرض",R.drawable.chest));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Myadabter(getApplicationContext(),items));

        left.setOnClickListener( View-> {

            Intent obj = new Intent(this, Login.class);
            startActivity(obj);

        });
        rigth.setOnClickListener(View->{
                Toast.makeText(this, "soon", Toast.LENGTH_SHORT).show();

        });
    }

    
}