package com.rentbyke.demo.model;

public class User {

private String userName;
private String password;
private int position;
private String image;
private String message;
private int flag;
private int priority;

    public User(String userName, String password, int position, String image, String message, int flag, int priority) {
        this.userName = userName;
        this.password = password;
        this.position = position;
        this.image = image;
        this.message = message;
        this.flag = flag;
        this.priority = priority;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
