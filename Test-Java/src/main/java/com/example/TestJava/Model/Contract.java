package com.example.TestJava.Model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number")
    private int number;

    @Column(name = "datecreate")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;

    @Column(name = "dateupdate")
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdate;

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

    public void setNumber(int number) {
        this.number = number;
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
