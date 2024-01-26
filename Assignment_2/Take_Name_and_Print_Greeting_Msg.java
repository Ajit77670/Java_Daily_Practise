package Assignment_2;

//Q: Take name as input and print a greeting message for that particular name.

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Take_Name_and_Print_Greeting_Msg {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        String str =sc.next();
        Name(str);
}

        static void  Name(String str){

        System.out.println("Hey how are you " +str);

    }



}
