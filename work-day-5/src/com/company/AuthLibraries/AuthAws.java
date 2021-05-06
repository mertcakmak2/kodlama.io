package com.company.AuthLibraries;

import com.company.Entities.Concretes.User;

public class AuthAws {

    public void loginWithAws(User user){
        if (user.getEmail().equals("")) {
            System.out.println(user.getEmail()+ "AWS Authorization başarısız."); return;
        }
        System.out.println(user.getEmail()+ " kullanıcısı AWS Auth ile giriş yaptı.");
    }
}
