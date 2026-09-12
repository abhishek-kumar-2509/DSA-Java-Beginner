/*  26. Check whether a triangle is valid based on three sides */


import java.util.Scanner;
public class Valid_trinangle_26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Side of the triangle: ");
        int a = sc.nextInt();

        System.out.print("Enter second Side of the triangle: ");
        int b = sc.nextInt();
        
        System.out.print("Enter third Side of the triangle: ");
        int c = sc.nextInt();
        
        if(a>0 && b>0 && c>0 && a+b > c && a+c > b && b+c > a){
            System.out.print("Valid Triangle");
        }else{
            System.out.print("Invalid Triangle");
        }
        sc.close();
    }
}
