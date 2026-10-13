/*43. Find the number obtained after removing the last digit */

import java.util.*;
public class Remove_Last_Digit_43 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int rem = n % 10;
        int lastD = n / 10;
        System.out.println("Given Number: "+ n);
        System.out.println("Last Digit of number: "+ rem);
        System.out.println("After Removing Last Number: "+ lastD);
        sc.close();
    }
}
