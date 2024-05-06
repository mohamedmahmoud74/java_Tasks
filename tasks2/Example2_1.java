package tasks2;

import java.util.Scanner;

public class Example2_1 {
    public static void main(String[] args) {
/*
        Write a Java program to Find maximum of three numbers using if condition
*/
        Scanner in = new Scanner(System.in);

        System.out.print("please Input number 1: ");
        int num1 = in.nextInt();
        System.out.print("please Input number 2: ");
        int num2 = in.nextInt();
        System.out.print("please Input number 3: ");
        int num3 = in.nextInt();
        if (num1 > num2 && num1 > num3)
        {
            System.out.println(" num 1 is the maximum");
        }
        else if  (num2> num1  && num2 > num3)
        {
            System.out.println(" num 2  is the maximum");
        }
        else {
            System.out.println("num 3 is the maximum");
        }

        }


    }

