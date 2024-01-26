package Assignment_2;

import java.util.Scanner;

// Q: To find Armstrong Number between two given number.
// ArmStrong nos  will give the result as same no upon the  power(^) of digits and its sum.
// for EX: 153=(1^3)+(5^3)+(3^3)=153 , this is 3 digit no so we did cube of the no and add to get the Armstrong no.

public class ArmStrong_No {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of digits");
        int digits =sc.nextInt();
        
        System.out.println(IsArmStrong(digits));
    }
    
    
    static boolean IsArmStrong(int num){
        
        int originl = num;
        int sum =0;

        while(num>0){ // Took while loop > 0 bcuz as long as no of ditis will be there the loop will iterate.

           int rem = num%10; // Gives the last digit of the no.
            
           sum= sum +(rem*rem*rem); // for 3 digit Armstrong

           num = num/10; // gives the remaining digit.
           
        }

        if(sum == originl){

            return true;
        }
        return false;
         
     }

     
    
}
