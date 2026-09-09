/*  20. Check whether a number is divisible by both 3 and 7 */

import java.util.*;
public class check_Divisible_3And7_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 7 == 0) {
            System.out.print(n + " is Divisible by 3 and 7: ");
        } else
            System.out.print(n + " Not Divisible By 3 and 7 ");

        sc.close();
    }
}
