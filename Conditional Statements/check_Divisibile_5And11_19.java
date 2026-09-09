/*  19. Check whether a number is divisible by 5 and 11  */

import java.util.*;
public class check_Divisibile_5And11_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 11 == 0) {
            System.out.print(n + " is Divisible by 5 and 11: ");
        } else
            System.out.print(n + " Not Divisible By 5 and  11 ");

        sc.close();

    }
}
