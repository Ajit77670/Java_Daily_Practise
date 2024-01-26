package Assignment_1;

// Youtube Solution : https://www.youtube.com/watch?v=B1gbmQF4o80

import java.util.Scanner;

public class GCD_Euclids_Optimized_by_Gabriel_Lame {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        System.out.println(GCD_Gabriel(a, b));
    }

    // Optimized-Algorithm for GCD- Gabriel Lame's Algorithm
    /*Algorithm:
    * Step 1: Find the Larger Number
    * Step 2 : Replace the Larger number by the % of smaller no.(i.e remainder will replace to larger no.)
    * Step 3 : Repeat step 1 and step 2 any one of the no equals to 0
    * Step 4 : Return the non-Zero no and that will be our GCD.
    */

    //Time Complexity:
    /*
     * O(log(min(a,b))) // i.e the iteration will be happen for log times.
     */

    static int GCD_Gabriel(int a , int b){

        while(a!=0 && b!=0)// Iterate till either of nos equal to 0. 
                           //i.e if any one of the no equal to 0 the another no will be our GCD.     
        { 
            if(a>b){

                a=a%b; // remainder will be store and replace to the larger no.
            }
            else{
                b=b%a; // remainder will be store and replace to the larger no.
            }
        }
        // Here any one of the no in last will become 0 and we should return the non-zero no that will be our GCD.
        if(a!=0){
            return a;  // if a is non zero it will be the GCD.
        }
        else{
            return b;  // if b is non zero it will be the GCD.
        }
        }
        

    }

