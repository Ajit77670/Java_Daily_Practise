package Assignment_1;

// Q: Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class Keep_Taking_int_input_untill_user_print_X {
    
    public static void main(String[] args) {
        
        String choice = "";
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int x = 0;

        while(!choice.equals("x")){
            System.out.println("Enter a number or x to quit");
            choice = in.next();

            if(!choice.equals("x")){
                int number = Integer.parseInt(choice); // converting String to int using Wrapper class object Integer
                sum = sum+number; // sum+=number;
                System.out.println(sum);
            }

    }
}
}