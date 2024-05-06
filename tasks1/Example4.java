package tasks1;

import java.util.Scanner;

public class Example4 {
    /*Write a Java program to print the area and perimeter of a circle has Radius =
7.5 with varaibles.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter Radius of the circle");
        double Radius= input.nextDouble();
        System.out.println(" the perimeter  of a circle:   "+ get_perimeter(Radius));
        System.out.println(" the area  of a circle:   "+ get_area(Radius));

    }
  static  double get_area(double radius)
    {
        return Math.PI*radius* radius;
    }

    static double get_perimeter(double radius)
    {
        return Math.PI*2* radius;
    }
}
