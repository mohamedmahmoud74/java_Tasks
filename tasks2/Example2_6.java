package tasks2;

import java.util.Scanner;

public class Example2_6 {
    public static void main(String[] args) {
/*
6- Write a Java program to find the maximum and minimum value of an array
*/
        Scanner input= new Scanner(System.in);
        int arr [] = new int [10];
        System.out.print(" enter data of array");
        for (int i = 0; i < arr.length-1; i++) {
            int in = input.nextInt();
            arr[i]=in;


        }
        System.out.println(" max value " + getMaxValue(arr));
        System.out.println(" min value " + getMinValue(arr));
    }

    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }


    public static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

}

