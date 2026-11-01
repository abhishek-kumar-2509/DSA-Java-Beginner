/* 47. Print all prime numbers within a given range */

import java.util.*;
public class Prime_Prime_In_Range_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Number: ");
        int start = sc.nextInt();
        System.out.print("Enter End Number: ");
        int end = sc.nextInt();
        
        
        System.out.print("Prime Number Between: " + start + " to " + end + " is : ");
        for(int i = Math.max(2, start); i <= end; i++){
            boolean isPrime = true;

            for(int j = 2; j*j<=i; j++){
                if(i%j==0){
                    isPrime= false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
