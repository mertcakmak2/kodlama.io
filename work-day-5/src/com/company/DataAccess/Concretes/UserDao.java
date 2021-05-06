package com.company.DataAccess.Concretes;

import com.company.DataAccess.Abstracts.IUserDao;
import com.company.Database.UserRepository;
import com.company.Email.Abstracts.IMailSender;
import com.company.Email.Concretes.MailSender;
import com.company.Entities.Concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements IUserDao {

    @Override
    public void saveUser(User user) {
        if(UserRepository.existUser(user)){
            System.out.println("Bu eposta adresi kullanılmakta.. => "+user.getEmail()); return;
        }
        UserRepository.users.add(user);
        System.out.println("Kayıt başarılı.. => "+user.getEmail());
        IMailSender mailSender = new MailSender();
        mailSender.sendMail(user.getEmail());
    }

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
