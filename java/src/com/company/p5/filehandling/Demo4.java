package com.company.p5.filehandling;

import com.company.p5.ReadData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {
    //A Program to copy data
    public static void main(String[] args) throws IOException {
        String fileName, fileNameT;
        System.out.println("Enter the file name full path to display : ");
        fileName = ReadData.sc.nextLine();
        System.out.println("Enter the target file name : ");
        fileNameT = ReadData.sc.nextLine();

        FileInputStream f1 = new FileInputStream(fileName);
        FileOutputStream f2 = new FileOutputStream(fileNameT);

        int n1,i=0; //n1 is byte returned -1 indicates the end of file
        while((n1=f1.read())!=-1){
            if(i<=30)//first 30 bytes store signature of file
            f2.write(n1);
            else{
                f2.write(n1);
                f2.write(0);
                f2.write(0);
                f1.read();
                f1.read();
            }
                i++;
        }

        f1.close();
        f2.close();
        System.out.print("\nJob Over");
    }
}
