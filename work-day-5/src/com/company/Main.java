package com.company;

import com.company.Business.Concretes.AuthManager;
import com.company.Business.Concretes.UserManager;
import com.company.Core.AuthGithubAdapter;
import com.company.Core.AuthGoogleAdapter;
import com.company.DataAccess.Abstracts.IAuthDao;
import com.company.DataAccess.Abstracts.IUserDao;
import com.company.DataAccess.Concretes.AuthUserDao;
import com.company.DataAccess.Concretes.UserDao;
import com.company.Entities.Concretes.User;

public class Main {

    public static void main(String[] args) {
        User user = new User(1,"mert","cakmak","mertcakmak2@gmail.com","121211","");
        User googleUser = new User(2,"admin","admin","admin@gmail.com","121211","");
        User githubUser = new User(3,"test","test","test@gmail.com","121211","");
        // only Login operation
        IAuthDao authDao = new AuthUserDao();
        // user Save and Activate operations(save, get, activate)
        IUserDao userDao = new UserDao();

        UserManager userManager1 = new UserManager(authDao, userDao);
        userManager1.saveUser(user);
        userManager1.activatedUser(user);
        userManager1.login(user);

        System.out.println("---------------------------------------");
        // failed with exist email
        userManager1.saveUser(user);

        System.out.println("---------------------------------------");

        //Google Auth
        IAuthDao googleAuthDao = new AuthGoogleAdapter();
        AuthManager googleAuthManager = new AuthManager(googleAuthDao);
        googleAuthManager.login(googleUser);
        //Github Auth
        IAuthDao githubAuthDao = new AuthGithubAdapter();
        AuthManager githubAuthManager = new AuthManager(githubAuthDao);
        githubAuthManager.login(githubUser);

    }
}
