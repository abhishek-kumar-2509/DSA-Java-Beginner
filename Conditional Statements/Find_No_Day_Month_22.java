/* 22. Find the number of days in a given month*/

import java.util.*;
public class Find_No_Day_Month_22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month Number (1 - 12): ");
        int month = sc.nextInt();

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println("31 Days");
                break;
                
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;
            
            case 2:
                System.out.print("28 or 29 Days");
                break;
            default: 
                System.out.print("Invalid Number!");
        }
        sc.close();
    }
}
