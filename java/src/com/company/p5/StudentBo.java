package com.company.p5;

public class StudentBo {
    //BO : Business Object --> EJP : Enterprises java bean


    public void calType(StudentDto s){
        if(s.getAge() <= 7)
            s.setType("Nursery");
        else if(s.getAge() <13)
            s.setType("Primary");
        else
            s.setType("Middle");
    }
}
