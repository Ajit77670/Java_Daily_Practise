package Assignment_1;

// Youtube Solution : https://www.youtube.com/watch?v=B1gbmQF4o80


import java.util.Scanner;

public class GCD_HCF_Brute_Force_Approach {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b =sc.nextInt();

      System.out.println(GCD_1(a, b));

    }

    //Brute force Approach (Alogo and its Time Complexity)
    /*Algorithm:
     * Step 1: Find the minimum of the two given nos. (min esliye kyunki uske aage ka koi bhi no will not be common for the given two no)
     * Step 2: Then iterate the for loop from min value to 1.Why iterate from min bcuz we need highest common factor which is obious will get from backside iterations.
     * Step 3: check the condition inside for loop if both the nos are divisible by i and gives remainder as 0 , those nos are the divisor
     * Step 4: At last return i among two nos which having greates divisor value other than 1.
     */

     /*Time Complexity
      * Step 1: Finding min value will uses 1 frequency--(i.e either if will execute or else)
      * Step 2: Iteration for min value(i.e for loop) will run for min times and +1 (for i<0) i.e min+1
      * Step 3: and if() statement will run 1 time less than for loop ,i.e min times
      * Step 4: return i will execute for 1 time.
      * Total step count = 1+ (min+1)+min +1 = 2min + 3 = Min
      *Final Time complexity will be O(min(a,b)) // i.e whichever the no is min , iteration will be haapen for that may times.
      */
    static int GCD_1(int a,int b)
    {
        int min=0; // initializing min =0
        if(a<b){ // if the a<b, put the value of a in min, in this way will find min

            min=a;
        }
        else{ // or if the b<a, put the value of b in min, in this way will find min

            min=b;
        }

        for(int i=min ; i>=1;i--){ // will start iteration from "min" bcuz we need to find the greatest common divisor,
                                // which is obisiouly we can find from the end 

            if(a%i==0 && b%i==0){

                return i; // the i will return the common divisior no, which completley divides the given two nos.
            }
        }
            return 1; // 1 is the common divisor for both the no, i.e if both the nos does not having the greatest common factor
                    // then 1 will anyway be the common divisor , and to avoid the arthemetic exception will return 1.

                    // or we can say why we had given this return "1" bcuz what if the return "i" will not give any no,then the
                    // function will throw the exception so to avoid this we had return 1.
    }

    

}
