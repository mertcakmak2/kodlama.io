package com.company.Business.Concretes;

import com.company.Business.Abstracts.IAuthManager;
import com.company.DataAccess.Abstracts.IAuthDao;
import com.company.DataAccess.Abstracts.IUserDao;
import com.company.Entities.Concretes.User;
import com.company.Utils.Utils;

public class AuthManager implements IAuthManager {

    private IAuthDao authUserDao;
    private IUserDao userDao;

    public AuthManager(IAuthDao authUserDao, IUserDao userDao) {
        this.authUserDao = authUserDao;
        this.userDao = userDao;
    }

    @Override
    public void saveUser(User user) {
        if(user.getEmail().equals("") || user.getName().equals("") || user.getPassword().equals("") ||user.getPassword().equals("") ){
            System.out.println("Lütfen bilgilerinizin tamamını doldurunuz.."); return;
        }
        if(user.getPassword().length() < 6){
            System.out.println("Parolanız 6 karakterden az olamaz.."); return;
        }
        if(!Utils.checkUserEmail(user.getEmail())){
            System.out.println("Email formatı yanlış.. => "+user.getEmail()); return;
        }
        if(user.getName().length() < 2 || user.getSurname().length()<2){
            System.out.println("Ad ve soyad 2 karakterden fazla olmalıdır.."); return;
        }
        this.authUserDao.saveUser(user);
    }

    @Override
    public void login(User user) {
        if(user.getEmail().equals("") || user.getPassword().equals("")){
            System.out.println("Kullanıcı adı ve şifre zorunludur.."); return;
        }
        if(!userDao.getUser(user)){
            System.out.println("Giriş yapabilmek için öncelikle kayıt olmalısınız.."); return;
        }
        if(!user.getActivated().equals("X")){
            System.out.println("Mailnize gelen epostadan doğrulama işlemini yapınız.."); return;
        }
        this.authUserDao.login(user);
    }
}
