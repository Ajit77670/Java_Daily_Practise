package Assignment_1;

import java.util.Scanner;

//Q: Input a year and find whether it is a leap year or not.
/*
 * Leap year contains 1 extra days i.e 366 days. That 1 extra days count in month of Feb with 29 Days.
 * After every 4 Years the Leap year will comes
 * 
 * Conditions to Chk for leap year:
 * a)it should be divisible by 4 and 400
 * b) and it should not divisible by 100
 */

public class Leap_Year {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        leapYear(year);
    }
    

    static void leapYear(int year){

        if((year%400 == 0) || (year%4 ==0 && year%100!=0)){

            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
        
}
