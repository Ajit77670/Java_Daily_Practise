package Assignment_2;

import java.util.Scanner;

//Q: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Two_no_input_with_diff_operators {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
    
        char op =in.next().charAt(0); // we had given index 0 , bcuz only one char option we need to choose to perform operation. 
   
        System.out.println(Operator(a, b, op));
    }

    static int Operator(int a , int b , char op){ 
        int ans = 0;
       

        if(op == '+'){

            ans = a +b ;
        }

        else if (op == '-'){

          
            ans = a-b ;
         }

         else if(op =='*'){

            ans = a*b;
         }

         else if(op== '/'){

            ans =a/b;
         }
        
         System.out.println("Your ans is :" +ans);
         return ans ;

    }
    
}
