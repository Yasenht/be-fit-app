package com.example.yas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.lifecycle.MutableLiveData;
import androidx.test.core.app.ActivityScenario;
import androidx.test.runner.AndroidJUnit4;

import com.example.yas.data.model.User;
import com.example.yas.ui.Login;
import com.example.yas.ui.LoginViewModel;
import com.example.yas.ui.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import android.widget.EditText;
import androidx.test.core.app.ActivityScenario;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
@RunWith(RobolectricTestRunner.class)

@Config(sdk = 28)

public class LoginActivityTest {

   @Test
    public void testLoginFields(){
       ActivityScenario<Login> scenario = ActivityScenario.launch(Login.class);



      scenario.onActivity(activity -> {
         EditText usernameEditText = activity.findViewById(R.id.log_username);
         EditText passwordEditText = activity.findViewById(R.id.log_password);
         usernameEditText.setText("testuser");
         passwordEditText.setText("testpass");
         String username = usernameEditText.getText().toString().trim();
         String password = passwordEditText.getText().toString().trim();

         assertFalse(username.isEmpty());
         assertFalse(password.isEmpty());

        });

   }


}