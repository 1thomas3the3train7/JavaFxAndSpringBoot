package com.example.testapp.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contract {
    private int id;
    private int number;
    private Date dateCreate;
    private String dateFormatCreate;
    private Date dateUpdate;
    private String dateFormatUpdate;
    private boolean active;

    public Contract(int id, int number, Date dateCreate, Date dateUpdate) {
        this.id = id;
        this.number = number;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getDateFormatCreate() {
        return dateFormatCreate;
    }

    public void setDateFormatCreate(String dateFormatCreate) {
        this.dateFormatCreate = dateFormatCreate;
    }

    public String getDateFormatUpdate() {
        return dateFormatUpdate;
    }

    public void setDateFormatUpdate(String dateFormatUpdate) {
        this.dateFormatUpdate = dateFormatUpdate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", number=" + number +
                ", dateCreate=" + dateCreate +
                ", dateUpdate=" + dateUpdate +
                '}';
    }
}
