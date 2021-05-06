package com.company.DataAccess.Concretes;

import com.company.DataAccess.Abstracts.IAuthDao;
import com.company.Database.UserRepository;
import com.company.Email.Abstracts.IMailSender;
import com.company.Email.Concretes.MailSender;
import com.company.Entities.Concretes.User;

public class AuthUserDao implements IAuthDao {

    @Override
    public void login(User user) {
        if(UserRepository.users.contains(user)){
            System.out.println("Giriş başarılı.. => "+user.getEmail()); return;
        }
        if(!UserRepository.users.contains(user)){
            System.out.println("Giriş yapabilmek için önce kayıt olmalısınız.."); return;
        }
        System.out.println("Email yada şifre yanlış.. => "+user.getEmail() );
    }

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
}
