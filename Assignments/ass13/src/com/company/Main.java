package com.company;

public class Main extends Member{

    public static void main(String[] args) {

        Member m=new Member();
        m.name="Chandu";
        m.age=30;
        m.salary=24313.032;

        System.out.println("Member name: "+m.name);
        System.out.println("Member age: "+m.age);
        System.out.println("Member salary: "+m.salary);

    }
}