package com.brillio.example.firstRestService;

import javax.persistence.*;

@Entity
@Table(name = "marks")
@IdClass(MarksKey.class)
public class MarksDTO {

    @Id
    //@GeneratedValue
    private String sid;
    @Id
   //@Column(name = "testno")
    private int testno;
    @Column(name = "m1")
    private int m1;
    @Column(name = "m2")
    private int m2;
    @Column(name = "m3")
    private int m3;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getTestno() {
        return testno;
    }

    public void setTestno(int testno) {
        this.testno = testno;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getM3() {
        return m3;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }
}
