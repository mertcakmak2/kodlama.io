package com.company.Business.Concretes;

import com.company.Business.Abstracts.IAuthManager;
import com.company.Business.Abstracts.IUserManager;
import com.company.DataAccess.Abstracts.IAuthDao;
import com.company.DataAccess.Abstracts.IUserDao;
import com.company.Entities.Concretes.User;
import com.company.Utils.Utils;

public class UserManager implements IUserManager {

    private IUserDao userDao;

    public UserManager(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void activatedUser(User user) {
        this.userDao.activatedUser(user);
    }
}
