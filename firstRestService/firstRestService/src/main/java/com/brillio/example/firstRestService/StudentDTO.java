package com.brillio.example.firstRestService;


import org.springframework.data.repository.query.Param;

import javax.persistence.*;


@Entity
@Table(name = "sdetails")
public class StudentDTO {
    @Id
    //@GeneratedValue //Automatically increments by 1
    private String sid;
    @Column(name = "fname")//Incase the variable name in table is different
    private String fname;
    @Column(name = "lname")
    private String lname;
    @Column(name = "dob")
    private String dob;
    @Column(name = "address")
    private String address;


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
