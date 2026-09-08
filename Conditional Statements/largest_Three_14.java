/* 14. Find the largest of three numbers */

import java.util.*;
public class largest_Three_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("Largest Number: " + a);
        }else if(b>=a && b>=c){
            System.out.println("Largest Number: " + b);
        }else{
            System.out.println("Largest Number: " + c);

        }
        sc.close();
    }
}
