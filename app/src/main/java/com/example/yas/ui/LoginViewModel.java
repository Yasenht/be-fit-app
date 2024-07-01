package com.example.yas.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.yas.data.model.User;
import com.example.yas.data.repository.UserRepository;

public class LoginViewModel extends AndroidViewModel {
    private final UserRepository repository;
    public LoginViewModel(@NonNull Application application) {
        super(application);
        repository = new UserRepository(application);
    }

    public LiveData<User> getUserByEmailAndPassword(String email, String password) {
        return repository.getUserByEmailAndPassword(email, password);
    }
}
