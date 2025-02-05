package com.exam.ass;

import java.util.HashMap;
import java.util.Map;


class UserManage {
    private Map<String, User> users = new HashMap<>();

    public void register(String name, String email, String password) {
        if (User.containsKey(email)) {
            System.out.println("User already exists!");
        } else {
            User.put(email, new User(name, email, password));
            System.out.println("User registered successfully!");
        }
    }

    public boolean login(String email, String password) {
        if (users.containsKey(email) && users.get(email).getPassword().equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid email or password!");
            return false;
        }
    }
}
