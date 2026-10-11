/* 40. Count the number of even and odd digits */

import java.util.*;
public class Count_Even_Odd_40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int ecount = 0;
        int ocount = 0;


        if(n==0){
            ecount++;
        }
        while(n>0){
            int digit = n %10;
            n/=10;
            if(digit % 2 == 0){
                ecount++;
            }else{
                ocount++;
            }
        }
        System.out.println("Even Digits: " + ecount);
        System.out.println("Odd Digits: " + ocount);
        sc.close();
    }
}
