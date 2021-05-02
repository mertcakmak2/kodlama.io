package com.company;

public class InstructorService {

    public void save(Instructor instructor){
        System.out.println(instructor.getName()+" saved");
    }

    public void delete(Instructor instructor){
        System.out.println(instructor.getName()+" deleted");
    }
}
