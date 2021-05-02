package Managers;

import Entities.User;

public class InstructorManager extends UserManager {

    @Override
    public void save(User user) {
        System.out.println(user.getName()+" instructor saved");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getName()+" instructor updated");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName()+" instructor deleted");
    }
}
