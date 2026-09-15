/* 31. Find the product of digits of a number */

import java.util.*;
public class product_Of_Digit_31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int product = 1;
        while(n>0){
            int digit = n % 10;
            product *= digit;
            n/=10;
        }
        System.out.println("Product of Digit: " + product);
        sc.close();

    }
}
