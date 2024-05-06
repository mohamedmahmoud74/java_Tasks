package tasks1;

import java.util.Scanner;

public class Example7 {
    /*Write a Java program to compare two numbers.
Check if they are
* Equals
* Not Equals
* Greater Than
* Less Than
* Greater Than or Equals
* Less Than or Equals
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number 1: ");
        int num1 = in.nextInt();
        System.out.print("Input number 2: ");
        int num2 = in.nextInt();
        if (num1 == num2)
            System.out.println(" num1 is equal num2");
        if (num1 != num2)
            System.out.println(" num1 not equal num2");
        if (num1 > num2)
            System.out.println(" num1 Greater than num2");
        if (num1 < num2)
            System.out.println(" num1 is less than num2");
    }


}
