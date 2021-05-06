package com.company.Business.Concretes;

import com.company.Business.Abstracts.IAuthManager;
import com.company.DataAccess.Abstracts.IAuthDao;
import com.company.Entities.Concretes.User;

public class OauthManager implements IAuthManager {

    private IAuthDao authUserDao;

    public OauthManager(IAuthDao authUserDao) {
        this.authUserDao = authUserDao;
    }

    @Override
    public void saveUser(User user) {
        this.authUserDao.saveUser(user);
    }

    @Override
    public void login(User user) {
        this.authUserDao.login(user);
    }
}
