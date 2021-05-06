package com.company.Business.Concretes;

import com.company.Business.Abstracts.IAuthManager;
import com.company.Business.Abstracts.IUserManager;
import com.company.DataAccess.Abstracts.IAuthDao;
import com.company.Entities.Concretes.User;

public class AuthManager implements IAuthManager {

    private IAuthDao authUserDao;

    public AuthManager(IAuthDao authUserDao) {
        this.authUserDao = authUserDao;
    }

    @Override
    public void login(User user) {
        this.authUserDao.login(user);
    }
}
