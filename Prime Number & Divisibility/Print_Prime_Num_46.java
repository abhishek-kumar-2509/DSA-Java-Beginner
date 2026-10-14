/* 46. Print all prime numbers from 1 to N */

import java.util.*;
public class Print_Prime_Num_46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.print("Prime Number: ");
        for(int i = 2; i<=n; i++){
            boolean isPrime = true;

            for(int j = 2; j*j<=i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
