/*   27. Determine whether a triangle is equilateral, isosceles or scalene <this is based on side>*/

import java.util.Scanner;
public class Valid_Triangle_27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first Side of the triangle: ");
        int a = sc.nextInt();

        System.out.print("Enter second Side of the triangle: ");
        int b = sc.nextInt();
        
        System.out.print("Enter third Side of the triangle: ");
        int c = sc.nextInt();
        
        if(a>0 && b>0 && c>0 && a+b > c && a+c > b && b+c > a){
            if(a == b && b == c){
                System.out.print("Equilateral Triangle");
            }else if(a == b || b == c || a == c){
                System.out.print("Isosceles Triangle");
            }else{
                System.out.print("Scalene Triangle");
            }
        } else {
                System.out.print("Invalid Triangle");
        }
        sc.close();
    }
}
