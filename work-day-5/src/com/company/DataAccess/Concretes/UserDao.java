package com.company.DataAccess.Concretes;

import com.company.DataAccess.Abstracts.IUserDao;
import com.company.Database.UserRepository;
import com.company.Entities.Concretes.User;

public class UserDao implements IUserDao {

    @Override
    public boolean getUser(User user) {
        if(UserRepository.users.contains(user)){
            return true;
        } return false;
    }

    @Override
    public void activatedUser(User user) {
        for (User existUser: UserRepository.users){
            if(existUser.getEmail() == user.getEmail()){
                existUser.setActivated("X");
                System.out.println("Üyeliğiniz doğrulanmıştır.. => "+user.getEmail());
            }
        }
    }
}
