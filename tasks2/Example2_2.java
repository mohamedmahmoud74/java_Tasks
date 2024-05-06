package tasks2;

import java.util.Scanner;

public class Example2_2 {
    public static void main(String[] args) {
/*
        Write a Java program to Check even or odd using if condition
*/
        Scanner in = new Scanner(System.in);

        System.out.print("please Input number 1: ");
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "  is  even");
        } else {
            System.out.println(num + "  is  odd");
        }

    }


}

