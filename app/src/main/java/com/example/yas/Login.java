package com.example.yas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends Activity implements View.OnClickListener {
    EditText name,passeword;
    Button ok, reset,reagister;
    String name0="yasen";
    String pass="1234";



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.log_in);
        name=findViewById(R.id.editTextText1);
        passeword=findViewById(R.id.editTextTextPassword);
        ok=findViewById(R.id.button);
        ok.setOnClickListener((View.OnClickListener) this);
        reset=findViewById(R.id.b);
        reset.setOnClickListener((View.OnClickListener) this);
        reagister=findViewById(R.id.button8);
        reagister.setOnClickListener((View.OnClickListener) this);

    }



    @Override
    public void onClick(View view) {
        String name1=name.getText().toString();
        String passeword1=passeword.getText().toString();
        if(R.id.button==view.getId())
        {
            if(name1.equals(name0)&&passeword1.equals(pass)||name1.equals("yasen "))
            {
                Intent obj=new Intent(this,MainActivity.class);
                startActivity(obj);
                Toast.makeText(this,"Thanks for your visit",Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this,"Sorry ; the entry is wrong",Toast.LENGTH_LONG).show();
            }
        }
        else{
            name.setText("");
            passeword.setText("");
        }
        if(R.id.button8==view.getId())
        {
            Intent obj2=new Intent(Login.this, Recyclerview.class);
            startActivity(obj2);
            Toast.makeText(this,"Sorry ; the entry is wrong",Toast.LENGTH_LONG).show();
        }
    }

}

