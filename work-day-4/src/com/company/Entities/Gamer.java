package com.company.Entities;

//Oyuncu(Müşteri) Modeli
public class Gamer extends User {

    //TcNo, Ad, Soyad, DoğumYılı E-Devlet validasyon.

    private String userName;
    private String createdYear;

    public Gamer(int id, String name, String surname, String password, String tcno, String birthYear, String userName, String createdYear) {
        super(id, name, surname, password, tcno, birthYear);
        this.userName = userName;
        this.createdYear = createdYear;
    }

    public Gamer() {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreatedYear() {
        return createdYear;
    }

    public void setCreatedYear(String createdYear) {
        this.createdYear = createdYear;
    }
}
