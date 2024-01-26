package Assignment_2;
//Q: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Simple_Interest {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal");
        int P =sc.nextInt();

        System.out.println("Enter the Rate");
        int R =sc.nextInt();

        System.out.println("Enter the time");
        int T =sc.nextInt();

        Simple_Interest_SI(P, R, T);
    }
    
    static void Simple_Interest_SI(int principal , int rate , int time){

        double SI ;

        SI= (principal*rate*time)/100;

        System.out.println("Simple Interese is "  +SI);

        
    }
}
