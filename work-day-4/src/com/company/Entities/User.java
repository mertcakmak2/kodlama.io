package com.company.Entities;

public class User {

    private int id;
    private String name;
    private String surname;
    private String password;
    private String tcno;
    private String birthYear;

    public User(int id, String name, String surname, String password, String tcno, String birthYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.tcno = tcno;
        this.birthYear = birthYear;
    }

    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", tcno='" + tcno + '\'' +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }
}
