package com.company.DataAccess.Abstracts;

import com.company.Entities.Concretes.User;

public interface IAuthDao {
    void login(User user);
    void saveUser(User user);
}
