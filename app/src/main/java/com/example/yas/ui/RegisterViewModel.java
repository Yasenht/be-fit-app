package com.example.yas.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.yas.data.model.User;
import com.example.yas.data.repository.UserRepository;

public class RegisterViewModel extends AndroidViewModel {
    private UserRepository repository;

    public RegisterViewModel(@NonNull Application application) {
        super(application);
        repository = new UserRepository(application);
    }

    public void insert(User user) {
        repository.insert(user);
    }
}
