package com.binatika.deteksigolongandarah.model;

import io.realm.RealmObject;

/**
 * Created by dev_deny on 4/1/17.
 */

public class UserModel extends RealmObject {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}