package Assignment_2;

//Q:Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest_of_Two_Numbers {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        System.out.println(Largest_Number(a, b));
    }


static int Largest_Number(int a,int b){

    if(a>b){

        System.out.println("a is the largest");
        return a;
    }
    else{
        System.out.println("b is the largest");
        return b;
    }


}

}
