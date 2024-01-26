package Assignement_3;

import java.util.Scanner;

//Q: Area Of Triangle

public class Area_of_Triangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double base =sc.nextDouble();
        double height =sc.nextDouble();
        
        System.out.println(Area_Triangle(base, height));
    }

    static double Area_Triangle(double base , double height){

        double Area =0.0;

        Area = Area + (base*height)/2;

        return Area;
    }
    
}
