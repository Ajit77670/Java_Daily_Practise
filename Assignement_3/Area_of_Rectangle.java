package Assignement_3;

import java.util.Scanner;

public class Area_of_Rectangle {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length =sc.nextInt();
        int breadth =sc.nextInt();
        

        System.out.println(Rectangle_Area(length, breadth));
        
        
    }

    static int Rectangle_Area(int length, int breadth){

        int Area = 0;

        Area = Area + (length *breadth);

        return Area;
    }
}
