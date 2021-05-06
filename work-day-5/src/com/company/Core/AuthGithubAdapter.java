package com.company.Core;

import com.company.AuthLibraries.AuthGithub;
import com.company.DataAccess.Abstracts.IAuthDao;
import com.company.Entities.Concretes.User;

public class AuthGithubAdapter implements IAuthDao {
    @Override
    public void login(User user) {
        AuthGithub authGithub = new AuthGithub();
        authGithub.loginWithGithub(user);
    }
}
