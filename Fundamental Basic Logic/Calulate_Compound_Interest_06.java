/* 6. Calculate compound interest */
import java.util.*;
public class Calulate_Compound_Interest_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int p = sc.nextInt();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time in Year: ");
        int t = sc.nextInt();

        double Amount = p*Math.pow(1+r/100, t);
        double ci = Amount - p;

        System.out.printf("Compound Interest: %.2f\n", ci);
        System.out.printf("Amount: %.2f", Amount);

        sc.close();

    }
}

