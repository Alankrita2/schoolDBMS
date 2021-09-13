package com.company.p5;

public class Demo1 {

    public static void main(String[] args) {
        String fname = "Ravi";
        String fname1 = "Ravi";

        StudentDto obj = new StudentDto(fname,10 );
        StudentDto obj1 = new StudentDto(fname1, 5 );

        System.out.println(fname.hashCode());
        System.out.println(fname.hashCode());
        System.out.println(obj.getFname().hashCode());
        System.out.println(obj1.getFname().hashCode());

        System.out.println(obj.equals(obj1));

        StudentBo obj2 = new StudentBo();
        obj2.calType(obj);
        obj2.calType(obj1);
        System.out.println(obj);
        System.out.println(obj1);


    }
}
