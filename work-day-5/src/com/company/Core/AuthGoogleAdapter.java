package com.company.Core;

import com.company.AuthLibraries.AuthGoogle;
import com.company.DataAccess.Abstracts.IAuthDao;
import com.company.Entities.Concretes.User;

public class AuthGoogleAdapter implements IAuthDao {

    @Override
    public void login(User user) {
        AuthGoogle authGoogle = new AuthGoogle();
        authGoogle.loginWithGoogle(user);
    }
}
