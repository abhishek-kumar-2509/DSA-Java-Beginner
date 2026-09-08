/* 15. Find the smallest of three numbers */

import java.util.*;
public class smallest_Three_15 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.println("Smallest Number: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Smallest Number: " + b);
        } else {
            System.out.println("Smallest Number: " + c);
        }
        sc.close();
    }
}
