/* 2. Perform addition, subtraction, multiplication and division of two numbers Operators */

import java.util.Scanner;
public class perform_Arthematic_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        
        int add = a+b;
        int subtraction = a - b;
        int multiplication = a*b;
        int division = a/b;
        
        
        System.out.print("\n********************************\n");
        System.out.println("First Number is : " + a);
        System.out.println("Second Number is : " + b);
        System.out.print("********************************\n");
        
        System.out.println("Addition of A + B : "  + add);
        System.out.println("Subtraction of A - B : "  + subtraction);
        System.out.println("Multiplication of A X B : "  + multiplication);
        System.out.println("Division of A / B : "  + division);

        sc.close();

    }
}
