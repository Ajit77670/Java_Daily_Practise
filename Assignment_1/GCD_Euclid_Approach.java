package Assignment_1;

// Youtube Solution : https://www.youtube.com/watch?v=B1gbmQF4o80

import java.util.Scanner;

public class GCD_Euclid_Approach {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println(EuclidGCD(a,b));
    }

    // Optimized-Algorithm for GCD- Euclid's Algorithm
    /*Algorithm:
    * Step 1: Find the Larger Number
    * Step 2 : Replace the Larger number by the differnce between the larger and the smaller number.
    * Step 3 : Repeat step 1 and step 2 untill both number becomes equal.
    * Step 4 : Return any one number ,which is the GCD
    */

    //Time Complexity:
    /*
     * O(max(a,b)) // i.e whichever the no is maximum the iteration will happeen for that may times.
     */


    static int EuclidGCD(int a , int b){

        while(a!=b){ // Iterate till both nos become equal ---- Step 3 

            if(a>b){ // Finding the larger number ---- Step 1

                a=a-b; // Differnce of larger no - smaller no  ---- Step 2
            }
            else{
    
                b=b-a; // Differnce of larger no - smaller no  ----Step 2
            }
        }

            return a; // we can return both a or b, as in last both no becomes equal and we can return any one of them,that will be ourGCD.

        


    }

}
