package com.company.p5.filehandling;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;

public class Demo1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name : ");
        String s1 = br.readLine();
        System.out.println(s1);

        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\alankrita.patel\\Documents\\java\\src\\com\\company\\p5\\filehandling\\demoText.txt"));
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\Users\\alankrita.patel\\Documents\\java\\src\\com\\company\\p5\\filehandling\\demoText1.txt"));

        String str1;

        while((str1 = br1.readLine())!=null){
            int sum=0;
            String [] str2 = str1.split(",");
            for (String x: str2) {
                sum += Integer.parseInt(x);
            }
            bw1.write(str1 + " : " + sum);
            bw1.newLine();
        }

        br.close();
        br1.close();
        bw1.close();

        System.out.println("Your data is processed");
    }
}
