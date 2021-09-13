package com.company.p4;

public class SplitDemo {
    public static void main(String[] args) {
        String s1 = "Select * from t1, t2";
        String s2[] = s1.split("from ");
        String s3[] = s2[1].split(",");
        for(int i=0;i<s2.length;++i){
            System.out.println(s2[i].trim());
        }

        System.out.println(s3);
    }
}
