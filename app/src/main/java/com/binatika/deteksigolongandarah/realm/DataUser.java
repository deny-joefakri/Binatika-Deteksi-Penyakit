package com.binatika.deteksigolongandarah.realm;

import android.app.Activity;

import com.binatika.deteksigolongandarah.model.GejalaPenyakitModel;
import com.binatika.deteksigolongandarah.model.UserModel;

import java.util.ArrayList;

/**
 * Created by dev_deny on 3/26/17.
 */

public class DataUser {

    public static ArrayList<UserModel> inputUser (Activity activity){
        RealmController.with(activity).clearUser();
        ArrayList<UserModel> inputUser = new ArrayList<>();

        UserModel userModel = new UserModel();
        userModel.setUsername("fauziah");
        userModel.setPassword("admin");
        inputUser.add(userModel);

        return inputUser;
    }

}
