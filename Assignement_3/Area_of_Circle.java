package Assignement_3;

import java.util.Scanner;

//Q: Area Of Circle Java Program

public class Area_of_Circle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius");
        double radius =sc.nextDouble();
        System.out.println(Area_Circle(radius));
    }

    static double Area_Circle(double radius){

        double Area=0;

        Area = Area + Math.PI*(radius*radius); 

        return Area;
    }

    

}
