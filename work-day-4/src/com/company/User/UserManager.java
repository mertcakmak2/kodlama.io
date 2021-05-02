package com.company.User;

import com.company.Entities.User;
import com.company.Interfaces.IUserManager;
import com.company.Utils.Utils;

public class UserManager implements IUserManager {

    @Override
    public void addUser(User user) {
        if(Utils.userValidate(user)){
            System.out.println(user.getName()+" adlı user kaydı başarıyla gerçekleştirildi");
        }
        else{
            System.out.println(user.getName()+" adlı userın bilgileri doğrulanamadı");
        }
    }

    @Override
    public void deleteUser(User user) {
        System.out.println(user.getName()+" adlı userın silinme işlemi başarıyla gerçekleştirildi");
    }

    @Override
    public void updateUser(User user) {
        System.out.println(user.getName()+" adlı userın güncellenme işlemi başarıyla gerçekleştirildi");
    }
}
