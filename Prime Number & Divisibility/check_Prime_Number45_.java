/* 45. Check whether a number is prime */

import java.util.*;
public class check_Prime_Number45_ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n <= 1){
            isPrime = false;
        }else{
            for(int i = 2; i <= n/2; i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.print(n +" is Prime Number ");
        }else{
            System.out.print(n +" is Not Prime Number ");
        }
        sc.close();
    }
}
/* 
46. Print all prime numbers from 1 to N
47. Print all prime numbers within a given range
48. Count the number of prime numbers from 1 to N
49. Find the Nth prime number
50. Find the next prime number greater than N
51. Find the previous prime number smaller than N
52. Find all prime factors of a number
53. Find the number of prime factors of a number
54. Find the largest prime factor of a number
55. Check whether a number has exactly two factors
56. Find all factors of a number
57. Count the number of factors of a number
58. Find the sum of all factors of a number
59. Check whether two numbers are co-prime
60. Check whether a number is a perfect square

*/