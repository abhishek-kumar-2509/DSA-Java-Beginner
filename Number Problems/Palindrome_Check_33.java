/* 33. Check whether a number is a palindrome */

import java.util.*;
public class Palindrome_Check_33 {
    public static void main(String[] argd){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = (rev*10)+digit;
            n/=10;
        }
        if(rev == temp){
            System.out.print("Palindromic number");
        }else
            System.out.print("Not a Palindromic number");

        sc.close();
    }
}
