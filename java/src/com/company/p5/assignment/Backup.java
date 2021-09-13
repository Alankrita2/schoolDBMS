package com.company.p5.assignment;

import java.io.*;

public class Backup {

    public static void copy(File sourceLoc, File targetLoc) throws IOException {
        if(sourceLoc.isDirectory()){
            copyDirectory(sourceLoc, targetLoc);
        }else{
            copyFile(sourceLoc, targetLoc);
        }
    }

    public static void copyDirectory(File sourceLoc, File targetLoc) throws IOException {
        if(!targetLoc.exists()){
            targetLoc.mkdir();
        }else{
            for(String str:sourceLoc.list())
            copy(new File(sourceLoc,str), new File(targetLoc, str));
        }
    }

    public static void copyFile(File sourceLoc, File targetLoc) throws IOException {
        FileInputStream f1 = new FileInputStream(sourceLoc);
        FileOutputStream fo = new FileOutputStream(targetLoc);

        int n1;
        while((n1 = f1.read())!=-1){
            fo.write(n1);
        }

        f1.close();
        fo.close();

    }

    public static void main(String[] args) throws IOException {
        String src, target;
        System.out.println("Enter source file name(full path) : ");
        src = Read.sc.nextLine();
        System.out.println("Enter target file name(full path) : ");
        target = Read.sc.nextLine();

        File srcfile = new File(src);
        File targetFile = new File(target);

        copyDirectory(srcfile, targetFile);
        System.out.println("Job Done!");
    }
}
