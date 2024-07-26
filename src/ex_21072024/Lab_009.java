package ex_21072024;

import java.util.Scanner;

public class Lab_009 {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of Side 1 ");
        int side1=sc.nextInt();


        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter length of Side 2 ");
        int side2=sc.nextInt();


        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter length of Side 3 ");
        int side3=sc.nextInt();

        if(side1==side2 && side2==side3)
        {
            System.out.println("Equilateral Triangle");
        } else if (side1==side2 || side2==side3 || side1==side3)
        {
            System.out.println("Isosceles Triangle");
        }else
        {
            System.out.println("Scalene Triangle");
        }


    }
}
