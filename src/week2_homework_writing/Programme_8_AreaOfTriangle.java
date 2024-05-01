package week2_homework_writing;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the length of the triangle : ");
        int length= scanner.nextInt();
        System.out.println("Please enter the height of the triangle : ");

        int height = scanner.nextInt();
        areaofTriangle(height, length);
        // closing the scanner object

        //Closing the scanner
        scanner.close();
    }
    //calculating the area of triangle with no return type with parameter method
    public static  void areaofTriangle(int length, int height){
        int area=(length*height)/2;
        System.out.println("The Area of a triangle is : "+area);
    }
}
