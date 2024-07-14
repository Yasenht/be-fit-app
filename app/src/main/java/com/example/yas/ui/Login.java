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

import java.util.Objects;


public class Login extends AppCompatActivity {

    public LoginViewModel loginViewModel;
    EditText username, passeword;
    Button navToRegister;
    public EditText usernameEditText, passwordEditText;
    public Button loginButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.log_in);
        try {
            LoginViewModelFactory factory = new LoginViewModelFactory(this.getApplication());
            loginViewModel = new ViewModelProvider(this, factory).get(LoginViewModel.class);
        } catch (Exception e) {
            Log.e("LOGIN_ERROR", Objects.requireNonNull(e.getMessage()));
            e.printStackTrace();
        }
        usernameEditText = findViewById(R.id.log_username);
        passwordEditText = findViewById(R.id.log_password);
        loginButton = findViewById(R.id.login);
        registerButton = findViewById(R.id.nav_to_register);

        loginButton.setOnClickListener(view -> {
            String username = usernameEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }
            try {
                loginViewModel.getUserByEmailAndPassword(username, password).observe(this, (user) -> {
                    if (user != null && !user.getUsername().isEmpty()) {
                        Intent obj = new Intent(this, MainActivity.class);
                        startActivity(obj);
                        Toast.makeText(this, "WELCOME " + user.getUsername(), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(this, "LOGIN is failed, user not found.", Toast.LENGTH_LONG).show();
//                        Log.e("INVALID_LOGIN", "LOGIN is failed.");
                    }
                });
            } catch (Exception e) {
                Log.e("LOGIN_ERROR", Objects.requireNonNull(e.getMessage()));

            }
        });
        registerButton.setOnClickListener(view -> {
            Intent obj2 = new Intent(Login.this, Rragister_activity.class);
            startActivity(obj2);
           // Toast.makeText(this, "Sorry ; the entry is wrong", Toast.LENGTH_LONG).show();

        });

    }

}

