//48. Count the number of prime numbers from 1 to N

import java.util.Scanner;

public class count_Prime_Num_48 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int count = 0;

        for(int i = 2; i<=n; i++){
            boolean isPrime = true;

            for(int j = 2; j*j<=i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }

        System.out.print("Total Prime No: "+ count);
        sc.close();
    }
}
