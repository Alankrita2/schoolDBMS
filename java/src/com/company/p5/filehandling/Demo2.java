package com.company.p5.filehandling;

import com.company.p5.ReadData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2 {
    //A Program to copy data
    public static void main(String[] args) throws IOException {
        String fileName;
        System.out.println("Enter the file name full path to display : ");
        fileName = ReadData.sc.nextLine();
        FileInputStream f1 = new FileInputStream(fileName);

        int n1; //n1 is byte returned -1 indicates the end of file
        while((n1=f1.read())!=-1){
            System.out.print((char)n1);
        }

        f1.close();
        System.out.print("\nJob Over");
    }
}
