package com.company;

import java.util.Scanner;
public class Main extends EvenNumTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        EvenNumTest ent=new EvenNumTest();
        boolean bool= ent.isEven(n);
        System.out.println(bool);
    }
}
