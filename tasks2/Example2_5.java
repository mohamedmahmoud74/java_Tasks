package tasks2;

import java.util.Scanner;

public class Example2_5 {
    public static void main(String[] args) {
/*
5. Write a program that prints the multiplication table of a number
using for , while , do while
*/
        Scanner in = new Scanner(System.in);
        System.out.println("solution by using for loop ");

        System.out.print("please enter number: ");
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mul = i * num;
            System.out.println(num + "*" + i + " = " + mul);

        }

        System.out.println("solution by using while loop ");

        int i = 1;

        while (i <= 10) {
            System.out.println(num + "*" + i + " = " + (i * num));
            i++;
        }
        System.out.println("solution by using  do  while loop ");
        int j = 1;
        do {

            System.out.println(num + "*" + j + " = " + (j * num));

            j++;
        } while (j <= 10);


    }


}

