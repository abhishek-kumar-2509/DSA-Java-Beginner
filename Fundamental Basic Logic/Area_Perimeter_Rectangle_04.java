/*  4. Calculate the area and perimeter of a rectangle */

import java.util.*;
public class Area_Perimeter_Rectangle_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length of Rectangle: ");
        int length = sc.nextInt();
        
        System.out.print("Enter breadth of Rectangle: ");
        int breadth = sc.nextInt();

        int area = length*breadth;
        int perimeter = 2*(length + breadth);


        System.out.println("Length of Rectange: " + length);
        System.out.println("Breadth of Rectange: " + breadth);
        System.out.println("Area of Rectange: " + area);
        System.out.println("Perimeter of Rectange: " + perimeter);

        sc.close();
    }
}
