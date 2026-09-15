    /*  29. Count the number of digits in a number */

import java.util.*;
public class Count_Digit_29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;
        if(n==0){
            count++;
        }else{
            while(n>0){
                count++;
                n/=10;
            }
        }
        System.out.print("Number of digit: " + count);
        sc.close();
    }    
}
/*
* 
* 36. Find the largest digit in a number
 * 37. Find the smallest digit in a number
 * 38. Count the frequency of a given digit
 * 39. Find the frequency of every digit from 0 to 9
 * 40. Count the number of even and odd digits
 * 41. Find the sum of even and odd digits separately
 * 42. Remove all zeroes from a number
 * 43. Find the number obtained after removing the last digit
 * 44. Check whether a number contains a particular digit
 */
