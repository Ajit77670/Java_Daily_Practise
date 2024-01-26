package Assignment_1;

//Youtube link : https://www.youtube.com/watch?v=3-IrS8nD5Yc

import java.util.Scanner;

public class LCM_Optimize_Euclid_Gabbriel {
    

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();

        System.out.println(find_LCM(a, b));

    }

    // Function for finding the LCM : ans = (a*b)/Euclid_optimize_GCD_Function()
    static int find_LCM(int a , int b){

        return (a*b)/Gabbriel_Euclid_Optimize(a,b); // This is a proven optimized formula for finding the LCM
    }

    // This is Optimized Formula of Euclid
    static int Gabbriel_Euclid_Optimize(int a, int b){


        while(a!=0 && b!=0){ // iterate till both nos "a" and "b" will not equal to 0.

            // Find the max no. and divide the max no. with smaller no. and strore the remainder in the no itself.
            if(a>b){

                a=a%b; // % gives value faster in less iteration , thats the optimized soln by Gabriel
            }
            else{
    
                b=b%a; // % gives value faster in less iteration , thats the optimized soln by Gabriel
            }

        }

        if(a!=0){   // Here  we are returning the non-zero no. that will be the GCD

            return a;
        }
        else{

            return b;
        }
        


    }
}



