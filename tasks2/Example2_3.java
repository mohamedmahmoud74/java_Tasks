package tasks2;

import java.util.Scanner;

public class Example2_3 {
    public static void main(String[] args) {
/*3. Write a Java program to Check if the character is lowercase or uppercase
using if condition
*/
        Scanner in = new Scanner(System.in);

        System.out.print("please Input charachter: ");
        char ch = in.next().charAt(0);
        check_char(ch);

    }
        static void check_char(char ch)
        {
            if (Character.isUpperCase(ch))
            {
                System.out.println( ch +" is upper case");
            } else if (Character.isLowerCase(ch)) {
                System.out.println( ch +" is lower case");
            }
            else {
                System.out.println(ch+ " is not a characher");
            }
        }


    }

