package com.example.yas.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.yas.R;
import com.example.yas.data.model.User;

import java.util.Objects;

public class Rragister_activity extends AppCompatActivity {

    private RegisterViewModel registerViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        try {
            RegisterViewModelFactory factory = new RegisterViewModelFactory(this.getApplication());
            registerViewModel = new ViewModelProvider(this, factory).get(RegisterViewModel.class);
        } catch (Exception e) {
            Log.e("REGISTER_ERROR", Objects.requireNonNull(e.getMessage()));
            e.printStackTrace();
        }
        EditText usernameEditText = findViewById(R.id.reg_username);
        EditText passwordEditText = findViewById(R.id.reg_password);
        EditText dobEditText = findViewById(R.id.dob);
        Button registerButton = findViewById(R.id.register);

        registerButton.setOnClickListener(view -> {
            try {
                String name = usernameEditText.getText().toString().trim();
                String dob = dobEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (name.isEmpty() || dob.isEmpty() || password.isEmpty()) {
                    Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return;
                }
                User user = new User();
                user.setUsername(name);
                user.setDob(dob);
                user.setPassword(password);
                registerViewModel.insert(user);
                Toast.makeText(this, "User registered successfully", Toast.LENGTH_SHORT).show();
                Intent obj = new Intent(Rragister_activity.this, MainActivity.class);
                startActivity(obj);
                finish();
            } catch (Exception e) {
                Log.e("REGISTER_ERROR", Objects.requireNonNull(e.getMessage()));
            }
        });
    }
}


