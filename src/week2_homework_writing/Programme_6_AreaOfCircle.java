package week2_homework_writing;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double radius = scanner.nextDouble();
        areaofCircle(radius);
        //closing the scanner object
        scanner.close();

    }
    //calculating the area of circle
    public static void areaofCircle(double radius){
        double pi= Math.PI;
        double area=(pi*radius*radius);
        System.out.println("The Area of circle is : 0"+area);
    }
}
