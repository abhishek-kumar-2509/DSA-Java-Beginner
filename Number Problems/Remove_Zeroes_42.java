/* 42. Remove all zeroes from a number */

import java.util.*;
public class Remove_Zeroes_42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();


        int place=1;
        int result=0;
        
        while(n > 0){
            int digit = n % 10;
            n/=10;
            if(digit == 0){
                continue;
            }else{
                result =result +  digit*place;
                place*=10;
            }
        }
        System.out.print("Non-Zeroes: " + result);
        sc.close();
    }
}
