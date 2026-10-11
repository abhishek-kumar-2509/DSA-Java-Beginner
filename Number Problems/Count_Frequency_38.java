/* 38. Count the frequency of a given digit */

import java.util.*;
public class Count_Frequency_38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        
        System.out.print("Enter target Number: ");
        int target = sc.nextInt();
        int count = 0;
        
        while(n>0){
            int digit = n % 10;
            if(digit == target){
                count++;
            }
            n/=10;
        }
        System.out.print(target + " Occure "+ count  + " times");
        sc.close();
    }
}
