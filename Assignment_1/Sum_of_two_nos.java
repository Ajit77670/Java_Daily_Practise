package Assignment_1;

import java.util.Scanner;

public class Sum_of_two_nos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        int num1 =sc.nextInt();
        System.out.println("Enter the Second no");
        int num2 =sc.nextInt();

       System.out.println("The sum of num1 & num2 is " +sum(num1, num2));

    }

    static int sum(int num1, int num2){

        int num = num1 + num2;
         
        return num;

    }
}
