package com.company.Core;

import com.company.AuthLibraries.AuthAws;
import com.company.AuthLibraries.AuthGithub;
import com.company.DataAccess.Abstracts.IAuthDao;
import com.company.Database.UserRepository;
import com.company.Entities.Concretes.User;

public class AuthAwsAdapter implements IAuthDao {

    @Override
    public void login(User user) {
        AuthAws authAws = new AuthAws();
        authAws.loginWithAws(user);
        saveUser(user);
    }

    @Override
    public void saveUser(User user) {
        UserRepository.users.add(user);
        System.out.println("AWS Auth sonrası kayıt başarılı.. => "+user.getEmail());
    }
}
