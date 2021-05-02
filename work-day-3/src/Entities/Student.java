package Entities;

public class Student extends User {

    private String university;

    public Student(int id, String name, int age, String university) {
        super(id, name, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
