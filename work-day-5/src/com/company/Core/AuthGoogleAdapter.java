package com.company.Core;

import com.company.AuthLibraries.AuthGoogle;
import com.company.DataAccess.Abstracts.IAuthDao;
import com.company.Database.UserRepository;
import com.company.Entities.Concretes.User;

public class AuthGoogleAdapter implements IAuthDao {

    @Override
    public void login(User user) {
        AuthGoogle authGoogle = new AuthGoogle();
        authGoogle.loginWithGoogle(user);
        saveUser(user);
    }

    @Override
    public void saveUser(User user) {
        if(UserRepository.existUser(user)){
            System.out.println("Bu eposta adresi zaten entegre edilmiş.. => "+user.getEmail()); return;
        }
        UserRepository.users.add(user);
        System.out.println("Google Auth sonrası kayıt başarılı.. => "+user.getEmail());
    }
}
