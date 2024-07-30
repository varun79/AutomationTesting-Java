package ex_27072024;

import java.util.Scanner;

public class Lab_012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of the Subjects "+(i+1));
            marks[i]=sc.nextFloat();
        }

        for (int i = 0; i < marks.length; i++) {
       System.out.println("Marks of sub " + (i + 1) + ": " + marks[i]);
        }

        float avg= (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Average of Subjects is "+avg);

        sc.close();
    }
}