package com.company.Business.Abstracts;

import com.company.Entities.Concretes.User;

public interface IUserManager {
    void saveUser(User user);
    void activatedUser(User user);
}
