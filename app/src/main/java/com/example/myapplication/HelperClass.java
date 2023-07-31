package com.example.myapplication;
public class HelperClass {

    String name, email, username, password,imageURL;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getImageURL() {
        return imageURL;
    }

    public HelperClass(String name, String email, String username, String password, String imageURL) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.imageURL = imageURL;
    }

    public HelperClass() {
    }
}
