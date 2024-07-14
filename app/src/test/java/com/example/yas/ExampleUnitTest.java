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
import com.example.yas.ui.Login;
import com.example.yas.ui.LoginViewModel;
import com.example.yas.ui.MainActivity;
import com.example.yas.ui.NM;

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
    public void add()throws Exception
    {
        NM o=new NM();
        int de=o.div(4,6);
        assertEquals("yasen",10,de,0);
    }

}
