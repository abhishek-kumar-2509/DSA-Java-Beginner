/*  25. Build a basic calculator using switch-case */

import java.util.*;
public class Calculator_SwitchCase_25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second Number: ");
        int b = sc.nextInt();

        int result;
        switch(operator){
            case '+':
                result = a+b;
                System.out.println("Result : " + result);
                break;
            case '-': 
                result = a-b;
                System.out.println("Result : " + result);
                break;
            case '*': 
                result = a*b;
                System.out.println("Result : " + result);
                break;
            case '/': 
            if(b == 0){
                System.out.println("Cannot divide by zero");
                break;
            }else{
            System.out.printf("Result : %.2f", (double)a/b);
                break;
            }
            default:
                System.out.print("Invalid operator");
        }
        sc.close();
    }
}
