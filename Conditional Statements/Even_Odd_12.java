/*  12. Check whether a number is even or odd   */

import java.util.*;
public class Even_Odd_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.print(n + " is Even");
        }else{
            System.out.print(n + " is Odd");

        }
        sc.close();
    }
}
