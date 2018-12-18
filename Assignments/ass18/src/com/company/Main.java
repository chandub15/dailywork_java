package com.company;
import java.util.Scanner;
import java.io.File;



public class Main {

    public static void main(String[] args){// write your code here

            Scanner sc = new Scanner(System.in);
            String s=sc.next();
            File file = new File(s);
            File[] files = file.listFiles();
            for(File f: files){
                System.out.println(f.getName());
            }
    }
}
