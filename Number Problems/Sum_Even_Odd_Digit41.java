/* 41. Find the sum of even and odd digits separately */

import java.util.*;
public class Sum_Even_Odd_Digit41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number ");
        int n = sc.nextInt();

        int Seven = 0;
        int Sodd = 0;

        while(n>0){
            int digit = n % 10;
            n/=10;
            if(digit%2==0){
                Seven+=digit;
            }else{
                Sodd+=digit;
            }
        }
        System.out.println("Sum of Even: " + Seven);
        System.out.println("Sum of Odd: " + Sodd);
        sc.close();
    }
}
