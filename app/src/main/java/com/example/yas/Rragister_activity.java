package com.example.yas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Rragister_activity extends Activity implements View.OnClickListener {

    EditText username,password,date;
    Button ok, reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        username=findViewById(R.id.user_name);
        password=findViewById(R.id.Password3);
        date=findViewById(R.id.Date);
        ok=findViewById(R.id.button3);
        ok.setOnClickListener(this);
        reset=findViewById(R.id.button2);
        reset.setOnClickListener(this);

    }
    public void onClick(View view) {
        String username2=username.getText().toString();
        String password2=password.getText().toString();
        if(R.id.button2==view.getId())
        {
            if(!(username.getText().equals(""))&&!(password.getText().equals("")))
            {
                Intent obj=new Intent(Rragister_activity.this,MainActivity.class);
                startActivity(obj);
                Toast.makeText(this,"Thanks for your visit",Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this,"Sorry ; the entry is wrong",Toast.LENGTH_LONG).show();
            }
        }
        else{
            username.setText("");
            password.setText("");
        }
    }

}


