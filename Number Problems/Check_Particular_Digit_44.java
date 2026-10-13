/* 44. Check whether a number contains a particular digit */

import java.util.*;
public class Check_Particular_Digit_44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        
        System.out.print("Enter target Number: ");
        int target = sc.nextInt();

        boolean found = false;
        if(n==0 && target == 0){
            found = true;
        }
        while(n>0){
            int digit = n % 10;
            if(digit == target){
                found = true;
                break;
            }
            n/=10;
        }
        if(found){
            System.out.print("Yes Particular Digit");
        }else
        System.out.print("Not a Particular Digit");
        sc.close();
    }
}
