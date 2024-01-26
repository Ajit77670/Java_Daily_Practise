package Assignment_2;

// Youtube : https://www.youtube.com/watch?v=8BlUi4-4N4E

import java.util.Scanner;

//Q: To find out whether the given String is Palindrome or not.

public class Palindrome {
    
public static void main(String[] args) {
    
isPalindrime(null);

}

static boolean isPalindrime(String str1){

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the String" );
    
    String str =in.next(); // String input from User
    
    String org_strng=str; // For comaring with original String

    String rev =""; // initialize empty string to add.

    int len = str.length(); // Find the length of the original String.

    for(int i =len-1 ; i>=0; i--){

        rev = rev +str.charAt(i); //Adding all char of Strings to empty string
    }
        
    System.out.println(rev);

    if(rev.equals(str)){  // compare with original String

        System.out.println("String is a Palindrome");
        return true;
    }
    else{

        System.out.println("String is not a Palindrome");
        return false;
    }

    

}

}