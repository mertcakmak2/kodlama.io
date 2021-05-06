package com.company.AuthLibraries;

import com.company.Entities.Concretes.User;

public class AuthGoogle {

    public void loginWithGoogle(User user){
        if (user.getEmail().equals("")) {
            System.out.println(user.getEmail()+ "Google Authorization başarısız."); return;
        }
        System.out.println(user.getEmail()+ " kullanıcısı Google Auth ile giriş yaptı.");
    }
}
