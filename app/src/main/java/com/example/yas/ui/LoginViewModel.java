package com.example.yas.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.yas.data.model.User;
import com.example.yas.data.repository.UserRepository;

public class LoginViewModelFactory implements ViewModelProvider.Factory {
    private final UserRepository repository;

    public LoginViewModelFactory(@NonNull Application application) {
        super();
        repository = new UserRepository(application);
    }

    public User getUserByEmailAndPassword(String email, String password) {
        return repository.getUserByEmailAndPassword(email, password);
    }
}
