package com.company.Database;

import com.company.Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static List<User> users = new ArrayList<User>();

    public static boolean existUser(User user){
        for (User existUser: users){
            if(existUser.getEmail() == user.getEmail()){
                return true;
            }
        }
        return false;
    }

}
