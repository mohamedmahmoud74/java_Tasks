package tasks1;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
     /*   1. Write a Java program to print 'Welcome' on screen and your name
        Expected Output :
        Hello Torkey
        2. Write a Java program to print the sum, multiply, subtract, divide and modulus
        of 125 and 24 with variables.
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
        */
        Scanner input = new Scanner(System.in);

        System.out.println(" Hello Salem");

/*
****************************************************************
*/
        System.out.println(" enter first num");
        int num1= input.nextInt();
        System.out.println(" enter second num");
        int num2= input.nextInt();
        int sum= num1 + num2;
        int sub= num1 - num2;
        int mul= num1 * num2;
        int div= num1 / num2;
        int mod= num1 % num2;
        System.out.println(" sum  equals" + "\t" + sum );
        System.out.println(" sub  equals" + "\t" +  sub );
        System.out.println(" mul  equals"  + "\t" + mul );
        System.out.println(" div  equals"  + "\t" + div );
        System.out.println(" mod  equals"  + "\t" + mod );

    }


}
