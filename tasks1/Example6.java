package tasks1;

import java.util.Scanner;

public class Example6 {
    /*Write a Java program that reads two floating-point numbers and tests whether
they are the same or not.*/
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number 1: ");
        double x = in.nextDouble();
        System.out.print("Input number 2: ");
        double y = in.nextDouble();

        x = Math.round(x * 1000);
        System.out.println(x);
        x = x / 1000;
        System.out.println(x);

        y = Math.round(y * 1000);
        System.out.println(y);
        y = y / 1000;
        System.out.println(y);


        if (x == y)
        {
            System.out.println("They are the same ");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
