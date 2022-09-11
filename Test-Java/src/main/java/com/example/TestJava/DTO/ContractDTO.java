package com.example.TestJava.DTO;

import java.util.Date;

public class ContractDTO{
    private Long id;
    private int number;
    private Date dateCreate;
    private Date dateUpdate;

    public ContractDTO(Long id, int number, Date dateCreate, Date dateUpdate) {
        this.id = id;
        this.number = number;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

    public Long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
}
