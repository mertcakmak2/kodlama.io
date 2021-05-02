package com.company.Utils;

import com.company.Entities.User;

public class Utils {

    public static boolean userValidate(User user){
        System.out.println(user.toString()+" Kullanıcı doğrulama işlemi yapılıyor.");
        if(user.getName() != null && user.getSurname() != null && user.getBirthYear() != null && user.getTcno() != null)
            return true;
        else return false;
    }
}
