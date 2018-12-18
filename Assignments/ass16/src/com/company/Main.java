package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] grade = new int[100];
        int sum=0,temp,count=0;

        for(int i=0;i<n;i++) {
            System.out.print("Enter the grade of student " + (i + 1)+": ");
            grade[i] = sc.nextInt();
            if (grade[i] <= 100) {
                sum=sum+grade[i];
                count++;
            } else {
                System.out.println("Enter grade value between 1 and 100");
                break;
            }

        }

        double avg= sum/(double)n;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(grade[i]<grade[j]) {
                    temp = grade[i];
                    grade[i] = grade[j];
                    grade[j] = temp;
                }
            }
        }
        if(count==n) {
            System.out.println("Average:" + avg);
            System.out.println("Minimum: " + grade[0]);
            System.out.println("Maximum: " + grade[n - 1]);
        }

    }
}

