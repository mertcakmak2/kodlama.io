package Managers;

import Entities.User;

public class UserManager {

    public void save(User user){
        System.out.println(user.getName()+" saved");
    }

    public void update(User user){
        System.out.println(user.getName()+" updated");
    }

    public void delete(User user){
        System.out.println(user.getName()+" deleted");
    }
}
