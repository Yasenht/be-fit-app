package com.example.yas.data.repository;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.yas.data.dao.UserDao;
import com.example.yas.data.db.AppDatabase;
import com.example.yas.data.model.User;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UserRepository {
    private UserDao userDao;
    private LiveData<List<User>> allUsers;
    private ExecutorService executorService;

    public UserRepository(Application application) {
        try {
            AppDatabase database = AppDatabase.getInstance(application);
            userDao = database.userDao();
            executorService = Executors.newFixedThreadPool(2);
            allUsers = _getAllUsers();
            _getAllUsers();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("UserRepository", Objects.requireNonNull(e.getMessage()));
        }

    }
    private LiveData<List<User>> _getAllUsers() {
        MutableLiveData<List<User>> usersLiveData = new MutableLiveData<>();
        executorService.execute(() -> {
            List<User> users = userDao.getAllUsers();
            usersLiveData.postValue(users);
        });
        return usersLiveData;
    }
    public LiveData<List<User>> getAllUsers() {
        return allUsers;
    }

    public void insert(User user) {
        executorService.execute(() -> userDao.insert(user));
    }

    public void update(User user) {
        executorService.execute(() -> userDao.update(user));
    }

    public void delete(User user) {
        executorService.execute(() -> userDao.delete(user));
    }

    public LiveData<User> getUserByEmailAndPassword(String email, String password) {
        MutableLiveData<User> userLiveData = new MutableLiveData<>();
        executorService.execute(() -> {
            User user = userDao.getUserByEmailAndPassword(email, password);
            userLiveData.postValue(user);
        });
        return userLiveData;
    }


}
