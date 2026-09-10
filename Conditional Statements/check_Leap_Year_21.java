
/* 21. Check whether a year is a leap year */

import java.util.*;
public class check_Leap_Year_21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Leap Year");
        }else
            System.out.println("Not Leap Year");

        sc.close();
    }
}
