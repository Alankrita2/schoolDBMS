package com.company.p5.assignment;

import com.company.p5.ReadData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.RandomAccessFile;

public class ReplaceWord {
    public static void main(String[] args) throws Exception{
        String fileName;
        System.out.println("Enter the file name(full path) to replace words : ");
        fileName = ReadData.sc.nextLine();


        File f1 = new File(fileName);
        BufferedWriter brw = new BufferedWriter(f1);
        long filePtr = 0;



        if(f1.exists()){
            //To check if the file is folder
            if(f1.isDirectory()) {
                String[] files = f1.list();
                for(String x:files){
                    System.out.println(x);
                }
            }else{
                System.out.println("Given filename is a file");
                String line;


            }
        }else{
            System.out.println("File Does not Exist!");
        }


        rm.close();
        System.out.print("\nJob Over");
    }
}
