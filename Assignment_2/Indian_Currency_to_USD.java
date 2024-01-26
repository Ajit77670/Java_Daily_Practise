package Assignment_2;

// Q: Input currency in rupees and output in USD.

import java.util.Scanner;

public class Indian_Currency_to_USD {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("Enter the amount in Rupees");
double Rupees =sc.nextDouble();

System.out.println("The Converted amount in USD is $" +Currency_Converter(Rupees));

}

// Function for Converting INdian rupees to USD
static double Currency_Converter(double rupee){

   double USD = rupee/84;

    return USD;

}

}
