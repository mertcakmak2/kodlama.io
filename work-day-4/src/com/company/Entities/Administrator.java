package com.company.Entities;


//Yönetici Modeli
public class Administrator extends User{

    private String department;
    private String position;

    public Administrator(int id, String name, String surname, String password, String tcno, String birthYear, String department, String position) {
        super(id, name, surname, password, tcno, birthYear);
        this.department = department;
        this.position = position;
    }

    public Administrator() {}

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
