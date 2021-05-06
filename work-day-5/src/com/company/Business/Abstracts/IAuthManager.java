package com.company.Business.Abstracts;

import com.company.Entities.Concretes.User;

public interface IAuthManager {
    void saveUser(User user);
    void login(User user);
}
