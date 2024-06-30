package com.example.myapplication.ui.login;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.yas.data.model.User;
import com.example.yas.data.repository.UserRepository;

public class LoginViewModel extends AndroidViewModel {
    private UserRepository repository;

    public LoginViewModel(@NonNull Application application) {
        super(application);
        repository = new UserRepository(application);
    }

    public User getUserByEmailAndPassword(String email, String password) {
        return repository.getUserByEmailAndPassword(email, password);
    }
}
