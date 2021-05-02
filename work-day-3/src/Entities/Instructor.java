package Entities;

public class Instructor extends User{

    private String mastery;

    public Instructor(int id, String name, int age, String mastery) {
        super(id, name, age);
        this.mastery = mastery;
    }

    public String getMastery() {
        return mastery;
    }

    public void setMastery(String mastery) {
        this.mastery = mastery;
    }
}
