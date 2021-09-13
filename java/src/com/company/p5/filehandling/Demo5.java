package com.company.p5.filehandling;

import com.company.p5.ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {
    //A Program to copy data
    public static void main(String[] args) throws IOException {
        String fileName;
        System.out.println("Enter the file name(full path) : ");
        fileName = ReadData.sc.nextLine();


        File f1 = new File(fileName);

        if(f1.exists()){
            //To check if the file is folder
            if(f1.isDirectory()) {
                String[] files = f1.list();
                for(String x:files){
                    System.out.println(x);
                }
            }else{
                System.out.println("File is given");
            }
        }else{
            System.out.println("File Does not Exist!");
        }


        System.out.print("\nJob Over");
    }
}
