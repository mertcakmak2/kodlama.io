package com.company;

import com.company.Business.Abstracts.IAuthManager;
import com.company.Business.Abstracts.IUserManager;
import com.company.Business.Concretes.AuthManager;
import com.company.Business.Concretes.OauthManager;
import com.company.Business.Concretes.UserManager;
import com.company.Core.AuthAwsAdapter;
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
        User awsUser = new User(3,"awsUser","awsUser","awsUser@gmail.com","121211","");

        IUserManager userManager = new UserManager(new UserDao());
        IAuthManager authManager = new AuthManager(new AuthUserDao(), new UserDao());
        authManager.saveUser(user);
        userManager.activatedUser(user);
        authManager.login(user);

        System.out.println("---------------------------------------");
        // failed with exist email
        authManager.saveUser(user);
        System.out.println("---------------------------------------");

        //Google Auth
        IAuthManager googleOauthManager = new OauthManager(new AuthGoogleAdapter());
        googleOauthManager.login(googleUser);
        //Github Auth
        IAuthManager githubOauthManager = new OauthManager(new AuthGithubAdapter());
        githubOauthManager.login(githubUser);
        //Aws Auth
        IAuthManager awsOauthManager = new OauthManager(new AuthAwsAdapter());
        awsOauthManager.login(awsUser);

    }
}
