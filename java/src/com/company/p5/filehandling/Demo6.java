package com.company.p5.filehandling;

import com.company.p5.ReadData;

import java.io.File;
import java.io.RandomAccessFile;

public class Demo6 {

    public static void main(String[] args) throws Exception{
        String fileName;
        System.out.println("Enter the file name(full path) to replcae : ");
        fileName = ReadData.sc.nextLine();


        File f1 = new File(fileName);
        RandomAccessFile rm = new RandomAccessFile(f1,"rw");
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
                int n;
                while ((n= rm.read())!=-1){
                    if(n==97){
                        rm.seek(filePtr);
                        rm.write(65);
                    }
                    filePtr++;
                    rm.seek(filePtr);
                }

            }
        }else{
            System.out.println("File Does not Exist!");
        }


        rm.close();
        System.out.print("\nJob Over");
    }
}
