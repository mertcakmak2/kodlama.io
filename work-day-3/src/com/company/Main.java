package com.company;

import Entities.Instructor;
import Entities.Student;
import Managers.InstructorManager;
import Managers.StudentManager;
import Managers.UserManager;

public class Main {

    public static void main(String[] args) {

        UserManager studentManager = new StudentManager();
        Student student = new Student(1,"mert cakmak", 23, "Sivas Cü");
        studentManager.save(student);
        studentManager.update(student);
        studentManager.delete(student);

        UserManager instructorManager = new InstructorManager();
        Instructor instructor = new Instructor(2,"Prof. Robert",45,"Algorithm");
        instructorManager.save(instructor);
        instructorManager.update(instructor);
        instructorManager.delete(instructor);

    }
}
