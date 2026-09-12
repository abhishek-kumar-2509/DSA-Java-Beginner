/*  28. Determine whether a triangle is acute, right or obtuse <this is based on angles>*/


import java.util.Scanner;
public class Valid_Triangle_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Side of the triangle: ");
        int x = sc.nextInt();
        

        System.out.print("Enter second Side of the triangle: ");
        int y = sc.nextInt();

        System.out.print("Enter third Side of the triangle: ");
        int z = sc.nextInt();

        int a,b,c;
        //Make x,y,z to a,b,c in the order of a<b<c
        if(x>=y && x>=z){
            a=y;
            b=z;
            c=x;
        }
        else if(y>=x && y>=z){
            a=x;
            b=z;
            c=y;
        }
        else{
            a=x;
            b=y;
            c=z;
        }
        

        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            if(a*a + b*b == c*c){
                System.out.print("Right Triangle");
            }else if(a*a + b*b > c*c){
                System.out.print("Acute Triangle");
            }else 
                System.out.print("Obtuse Triangle");
        } else {
            System.out.print("Invalid Triangle");
        }
        sc.close();
    }
}
