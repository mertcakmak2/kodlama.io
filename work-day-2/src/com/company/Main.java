package com.company;

public class Main {

    public static void main(String[] args) {

        CourseService courseService = new CourseService();
        InstructorService instructorService = new InstructorService();

        Instructor instructor1 = new Instructor(1, "Robert Cecil Martin");
        Instructor instructor2 = new Instructor(1, "Martin Fowler");
        Instructor instructor3 = new Instructor(1, "Kent Beck");

        Instructor[] instructors = new Instructor[]{instructor1, instructor2, instructor3};
        for (Instructor instructor: instructors){
            System.out.println(instructor.toString());
            instructorService.save(instructor);
            instructorService.delete(instructor);
        }

        System.out.println("------------");

        Course course1 = new Course(1,"Java Course1", "java variables");
        Course course2 = new Course(2,"Java Course2", "java constructor method");
        Course course3 = new Course(3,"Java Course3", "java getter setter");
        Course[] courses = new Course[]{course1, course2, course3};
        for (Course course: courses){
            System.out.println(course.toString());
            courseService.join(course);
            courseService.leave(course);
        }
    }
}
