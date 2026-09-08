/*  5. Calculate simple interest  */

import java.util.*;
public class Calculate_Simple_Interest_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal: ");
        int p = sc.nextInt();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time in Year: ");
        int t = sc.nextInt();

        double si = p*r*t/100;

        System.out.println("Simple Interest: " +si);
        sc.close();

    }
}
