/* 35. Find the sum of the first and last digit */
import java.util.*;
public class First_Last_Sum_35 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int first = n;
        int last = n % 10;
        
        int sum = 0;
        while(first >= 10){
            first /= 10;
        }
        sum = last + first;
        System.out.print("Sum of last + First : " + sum);
        sc.close();
    }
    
}
