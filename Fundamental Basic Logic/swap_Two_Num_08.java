/*  * 8. Swap two numbers using a temporary variable    */

import java.util.Scanner;
public class swap_Two_Num_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a; 
        a=b;
        b=temp;
        System.out.print("Swaped: "+ a + " " +  b);

        sc.close();
    }
}
