package week2_homework_writing;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        // Scanner declaration for reading input form console
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first variable value: ");
        int first=scanner.nextInt();
        System.out.println("Enter the second variable value: ");
        int second= scanner.nextInt();
        Programme_15_SwapTheValue t= new Programme_15_SwapTheValue();

        //Close the scanner object
        scanner.close();
    }
    public void swapTheValue(int a , int b){
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c=a;
        a=b;
        b=c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);
    }
}
