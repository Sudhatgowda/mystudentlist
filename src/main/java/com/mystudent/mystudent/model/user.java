package com.mystudent.mystudent.model;


import javax.persistence.*;

@Entity
public class user {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int rollno;
    @Column
    private String fname;
    @Column
    private String lname;

    public int getRollno() {
        return rollno;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLnmae(String lname) {
        this.lname = lname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
