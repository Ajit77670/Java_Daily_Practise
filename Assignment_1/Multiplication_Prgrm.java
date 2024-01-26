package Assignment_1;

import java.util.Scanner;

public class Multiplication_Prgrm {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Multiplication No.:");
      int num =sc.nextInt();
        
      multiply(num);

    }

    static int multiply(int num)
    {
        for(int i=1;i<=10;i++){

           System.out.println(num+ "*" +i+ "=" +num*i); // we just write the table format in syso. Thats it
        }
  
        return num;

    }
}
