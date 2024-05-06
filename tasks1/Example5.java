package tasks1;

import java.util.Scanner;

public class Example5 {
    /*Write a Java program to get a number and print whether it is positive or
negative or Zero.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the number");
        double number= input.nextDouble();
        if (number >0  )
        {
            System.out.println("Number is positive");
        } else if (number < 0) {

            System.out.println("Number is negative");

        }
        else {
            System.out.println(" Number equal Zero");
        }
    }
}
