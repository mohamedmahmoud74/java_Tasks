package tasks2;

import java.util.Scanner;

public class Example2_7 {

    /*7. Write a program to join all elements of the following array into a string.
Sample array {"Red", "Green", "White", "Black"}*/
    public static void main(String[] args) {

        String[] array = {"Red", "Green", "White", "Black"};

        String result = joinArrayToString(array);

        System.out.println("Joined String: " + result);

    }

    public static String joinArrayToString(String[] array) {

        StringBuilder sb = new StringBuilder();


        for (String element : array) {
            sb.append(element).append("     ");

        }

        return sb.toString().trim();
    }

}

