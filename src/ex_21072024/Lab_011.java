package ex_21072024;

import java.util.Scanner;

public class Lab_011 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Year to check Leap year or not?");
        int year=sc.nextInt();

        if(year%4==0){
            System.out.println("It is a Leap Year");
        }else {
            System.out.println("It is not a Leap Year");
        }
    }
}
