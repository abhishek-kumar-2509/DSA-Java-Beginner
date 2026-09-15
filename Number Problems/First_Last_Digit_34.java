/* 34. Find the first and last digit of a number */

import java.util.*;
public class First_Last_Digit_34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        
        int first = n;
        int last = n % 10;
        while(first >= 10){
            first/=10;
        }
        System.out.println("First Number: " + first);
        System.out.println("Last Number: " + last);

        sc.close();
    }
    
}
