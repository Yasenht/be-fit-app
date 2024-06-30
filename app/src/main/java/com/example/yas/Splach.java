package com.example.yas;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Splach extends Activity implements View.OnClickListener {
    LinearLayout click;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splach);
        click=findViewById(R.id.splach);
        click.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent obj=new Intent(this,Login.class);
        startActivity(obj);
    }



}
