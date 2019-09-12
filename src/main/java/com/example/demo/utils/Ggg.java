package com.example.demo.utils;

public class Ggg {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Ggg(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Ggg{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
