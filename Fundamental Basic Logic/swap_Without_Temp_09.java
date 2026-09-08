/*  * 9. Swap two numbers without using a temporary variable     */

import java.util.*;
public class swap_Without_Temp_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();       //10
        int b = sc.nextInt();       //12

        a=a+b;
        b=a-b;      
        a=a-b;

        System.out.print("a = " + a + " b = " + b);
        sc.close();
    }
}
