package Managers;

import Entities.User;

public class StudentManager extends UserManager {
    @Override
    public void save(User user) {
        System.out.println(user.getName()+" student saved");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getName()+" student updated");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName()+" student deleted");
    }
}
