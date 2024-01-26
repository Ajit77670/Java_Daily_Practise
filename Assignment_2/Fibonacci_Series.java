package Assignment_2;

import java.util.Scanner;


// YouttubeLink : https://www.youtube.com/watch?v=QqX1ExNAev0&t=103s
//Q: To calculate Fibonacci Series up to n numbers.
// 0,1,1,2,3,5,8,13,21,34.......

public class Fibonacci_Series {
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fibo Series Number:");
        int n =sc.nextInt();
        fib(n);
    }

    static void fib(int n){

        int sum =0;  
        int n1 =0;
        int n2 =1;
       
        System.out.print(n1+" "+n2);

        for(int i=2;i<=n;i++){
          
          sum= n1 + n2;    
          System.out.print(" " +sum);   // This line is must , after printing the n1 ,n2 , the sum will also print till loops iterate.
           n1= n2;
           n2=sum;   
         }
    }
}
