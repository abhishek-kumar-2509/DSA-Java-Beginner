/* 10. Find the ASCII value of a character   */

import java.util.*;
public class Find_ASCII_Value_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char ch = sc.next().charAt(0);
        System.out.print((int)ch);
        sc.close();
    }
}
