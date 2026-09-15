/*32. Reverse a number */

import java.util.*;
public class Reverse_Number_32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = (rev*10)+digit;
            n/=10;
        }
            System.out.print("Reverse Number: " + rev);
            sc.close();
    }
}
