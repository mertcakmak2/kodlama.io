package com.company.AuthLibraries;

import com.company.Entities.Concretes.User;

public class AuthGithub {

    public void loginWithGithub(User user){
        if (user.getEmail().equals("")) {
            System.out.println(user.getEmail()+ "Github Authorization başarısız."); return;
        }
        System.out.println(user.getEmail()+ " kullanıcısı Github Auth ile giriş yaptı.");
    }
}
