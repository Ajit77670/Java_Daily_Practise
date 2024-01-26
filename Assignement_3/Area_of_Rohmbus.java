package Assignement_3;

import java.util.Scanner;

public class Area_of_Rohmbus {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height =sc.nextInt();

        System.out.println(Rhombus_Area(base, height));
        
    }

    static int Rhombus_Area(int base , int height){

        int Area =0;

        Area = Area + (base*height)/2;

        return Area;

    }

}
