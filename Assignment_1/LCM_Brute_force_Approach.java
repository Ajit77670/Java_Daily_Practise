package Assignment_1;

//Youtube link : https://www.youtube.com/watch?v=3-IrS8nD5Yc

import java.util.Scanner;

public class LCM_Brute_force_Approach {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(LCM(a,b));
    }

    static int LCM(int a, int b){

        // Will find the max no and then start itertion from there, bcuz max no will never gonna divide the lesser no by itself for sure.
        // and so for this reason will use while loop and will make it true.
        
        //Step 1: Find the max no.
        int max=0;

        if(a>b){

            max=a;
        }
        else{

            max=b;
        }

        // Step 2: Will use while loop and make it true
        while(true){

         // Step 3: will check the conditions if the max no is geeting divided by given two nos exactly        
           if(max%a==0 & max%b==0){
            break; // and once the no found i.e conditions meet we should break the loop or the loop will become infinite.
           }
           max++; // will increment max to "max++" so that it will check and iterate with other nos if condition does not meet.
            
    }
        
         return max; // Finally will return the max which containg the LCM 

       

    }
}
