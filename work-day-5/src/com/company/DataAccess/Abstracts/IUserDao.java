package com.company.DataAccess.Abstracts;

import com.company.Entities.Concretes.User;

public interface IUserDao {
    boolean getUser(User user);
    void activatedUser(User user);
}
