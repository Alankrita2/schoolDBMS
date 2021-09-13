package com.company.p5;

import java.util.Objects;

public class StudentDto {
    //DTO
    private String fname;
    private String type;
    private int age;


    public StudentDto() {
        super();
    }

    public StudentDto(String fname, int age) {
        this.fname = fname;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDto that = (StudentDto) o;
        //return age == that.age && fname.equals(that.fname) && type.equals(that.type);
        return this.hashCode() == that.hashCode();

    }

    @Override
    public int hashCode() {
        return fname.hashCode() + age;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "fname='" + fname + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
