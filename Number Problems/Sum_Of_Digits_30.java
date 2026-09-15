/* 30. Find the sum of digits of a number  */

import java.util.*;
public class Sum_Of_Digits_30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int sum = 0;
        while(n>0){
            int digit = n % 10;
            sum += digit;
            n/=10;
        }
        System.out.print("Sum of digit: " + sum);
        sc.close();

    }
}
