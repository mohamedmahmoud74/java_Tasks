package tasks2;

import java.sql.SQLOutput;

public class Example2_8 {
  /*  Write a program that has two arrays with individual values. Write a program to
    compute the sum of each individual index value in the given array:*/
    public static void main(String[] args) {

        int i = 0;
        int arr1[] = {1, 5, 6, 8, 2, 10};
        int arr2[] = {5, 6, 8, 2, 1, 3};
        int arr_sum[] = new int[arr1.length];
        for (int num : arr1) {
            arr_sum[i] = num + arr2[i];
            i++;
        }

        for (int sum : arr_sum) {
            System.out.print(sum + "   ");
        }
    }
    }



