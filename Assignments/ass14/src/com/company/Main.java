package com.company;

import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        int c = 0;
        // pass the path to the file as a parameter
        File file =
                new File("C:\\Users\\ChandraPBommadevara\\Desktop\\STACKROUTE\\dailywork_java\\test.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));


        String line;
        while((line = reader.readLine()) != null)
        {
                String s = line.trim();
                System.out.println(s);
                String str= s.replaceAll("\\s+","");
                int count =str.length();
                System.out.println("length of file:"+ count);

        }




    }
}
