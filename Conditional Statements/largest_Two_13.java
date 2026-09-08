/*  13. Find the largest of two numbers */

import java.util.*;

public class largest_Two_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.print("Largest Number: " + a);
        } else
            System.out.print("Largest Number: " + b);

        sc.close();
    }
}
