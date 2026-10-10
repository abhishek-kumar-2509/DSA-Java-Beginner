/* 36. Find the largest digit in a number */

import java.util.*;
public class Largest_Digit_36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int max_digit=0;
        while(n>0){
            int digit = n % 10;
            if(digit > max_digit){
                max_digit=digit;
            }
            n/=10;
        }
        System.out.print(max_digit);
        sc.close();
    }
}
