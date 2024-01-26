package Assignment_2;
// Q: Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Even_No {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(even(num));
    }

    static boolean even(int num){

        if(num%2==0){

            System.out.println("Even No");
            return true;
        }
        else{

            System.out.println("Odd No");
            return false;
        }
    }
    
}
