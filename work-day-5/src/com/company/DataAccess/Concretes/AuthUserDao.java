package com.company.DataAccess.Concretes;

import com.company.DataAccess.Abstracts.IAuthDao;
import com.company.Database.UserRepository;
import com.company.Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class AuthUserDao implements IAuthDao {

    @Override
    public void login(User user) {
        if(UserRepository.users.contains(user)){
            System.out.println("Giriş başarılı.. => "+user.getEmail()); return;
        }
        if(!UserRepository.users.contains(user)){
            System.out.println("Giriş yapabilmek için önce kayıt olmalısınız.."); return;
        }
        System.out.println("Email yada şifre yanlış.. => "+user.getEmail() );
    }
}
