package tasks2;

import java.util.Scanner;

public class Example2_4 {
    public static void main(String[] args) {
/*

Write a Java program to Check if the character is vowel or consonant using
switch case

*/
        Scanner in = new Scanner(System.in);

        System.out.print("please Input charachter: ");
        char ch = in.next().charAt(0);

        check_char(ch);
    }

    static void check_char(char characher) {
        switch (characher) {
            case ('a'):
            case ('e'):
            case ('i'):
            case ('o'):
            case ('u'):
            case ('A'):
            case ('E'):
            case ('I'):
            case ('O'):
            case ('U'):

                System.out.println(characher + "  is vowel");
                break;
            default:
                System.out.println(characher + "  is constant");
                break;
        }


    }


}

