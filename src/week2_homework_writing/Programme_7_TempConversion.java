package week2_homework_writing;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the tempratur in fahrenheit : ");
        float temp = scanner.nextFloat();
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTempToDegreeCelcius(temp);
        //Clsosing the scanner
        scanner.close();
    }
    //Temprature conversion method
    public void convertTempToDegreeCelcius(float temp){
        float c =((temp-32) * 5/9);
        System.out.println("The temperature " + temp+" fahrenheit is equal to "+c+ " degree celsius");
    }
}
