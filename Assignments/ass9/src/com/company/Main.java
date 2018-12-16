package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


                Scanner sc=new Scanner(System.in);
                String s=sc.next();
                char[] arr = s.toCharArray();
                int i,j=0;
                j= arr.length-1;

                for (i=0; i < j ; i++ ,j--)
                {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }

                for (char c : arr)
                    System.out.print(c);
                System.out.println();




    }
}
