package com.apt.s41;

public class User {
    private String name;
    private String phone;
    private int avatar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public User(String name, String phone, int avatar) {
        this.name = name;
        this.phone = phone;
        this.avatar = avatar;
    }
}
