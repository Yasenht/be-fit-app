package com.example.yas;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import android.content.Intent;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

import com.example.yas.data.model.User;
import com.example.yas.ui.Checking;
import com.example.yas.ui.Login;
import com.example.yas.ui.LoginViewModel;
import com.example.yas.ui.MainActivity;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public  void entryname()throws Exception {
        Checking checked=new Checking();String realvalue;
        String name="";
        realvalue=checked.processNameinput(name);
        assertEquals("Please enter your name",realvalue);

        name=" yasen";
        realvalue=checked.processNameinput(name);
        assertEquals("name of user content speaces in the bigein ",realvalue);

        name="yasen";
        realvalue=checked.processNameinput(name);
        assertEquals("yasen",realvalue);
    }

    public  void entrypassword()throws Exception {
        Checking checked=new Checking();String realvalue;
        String pass="";
        realvalue=checked.processpassinput(pass);
        assertEquals("Please enter your password",realvalue);

        pass="12345678";
        realvalue=checked.processpassinput(pass);
        assertEquals("this password less than eight boxes",realvalue);

        pass="12345678999";
        realvalue=checked.processpassinput(pass);
        assertEquals("this password more than 20 boxes",realvalue);
        pass="987654321";
        realvalue=checked.processpassinput(pass);
        assertEquals("987654321",realvalue);
    }

}