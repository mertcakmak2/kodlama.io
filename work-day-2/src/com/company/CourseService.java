package com.company;

public class CourseService {

    public void join(Course course){
        System.out.println("joined "+ course.getName());
    }

    public void leave(Course course){
        System.out.println("leaved "+ course.getName());
    }
}
