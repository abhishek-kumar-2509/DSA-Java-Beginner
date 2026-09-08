/*  11. Check whether a number is positive, negative or zero     */
import java.util.*;
public class check_Positive_Negative_Zero_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.print("Positive");
        }else if(a<0){
            System.out.print("Negative");
        }else{
            System.out.print("Zero");
        }
        sc.close();
    }
}
