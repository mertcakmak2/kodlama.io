package com.company.DataAccess.Abstracts;

import com.company.Entities.Concretes.User;

public interface IUserDao {
    void saveUser(User user);
    boolean getUser(User user);
    void activatedUser(User user);
}
