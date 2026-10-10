/* 37. Find the smallest digit in a number */

import java.util.*;
public class Smallest_Digit_37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int min_digit=9;
        
        while(n>0){
            int digit = n % 10;
            if(digit<min_digit){
                min_digit=digit;
            }
            n/=10;
        }
        System.out.print("Smallest Digit: " + min_digit);
        sc.close();
    }
}
