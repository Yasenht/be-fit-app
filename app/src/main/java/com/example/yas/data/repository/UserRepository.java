package com.example.yas.data.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.yas.data.dao.UserDao;
import com.example.yas.data.db.AppDatabase;
import com.example.yas.data.model.User;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UserRepository {
    private UserDao userDao;
    private List<User> allUsers;
    private ExecutorService executorService;

    public UserRepository(Application application) {
        AppDatabase database = AppDatabase.getInstance(application);
        userDao = database.userDao();
        executorService = Executors.newFixedThreadPool(2);
        allUsers = userDao.getAllUsers();
    }

    public List<User> getAllUsers() {
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

    public User getUserByEmailAndPassword(String email, String password) {
        try {
            return new GetUserByEmailAndPasswordAsyncTask(userDao).execute(email, password).get();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }


    private static class GetUserByEmailAndPasswordAsyncTask extends AsyncTask<String, Void, User> {
        private UserDao userDao;

        private GetUserByEmailAndPasswordAsyncTask(UserDao userDao) {
            this.userDao = userDao;
        }

        @Override
        protected User doInBackground(String... params) {
            return userDao.getUserByEmailAndPassword(params[0], params[1]);
        }
    }
}
