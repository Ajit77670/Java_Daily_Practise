package Assignement_3;

import java.util.Scanner;

public class Arae_of_Parellelogram {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();

            System.out.println(Area_Parllelogram(base, height));
    }

    static double Area_Parllelogram(double base , double height){


        double Area =0.0;

        Area = Area + (base*height);

        return Area;
    }
}
