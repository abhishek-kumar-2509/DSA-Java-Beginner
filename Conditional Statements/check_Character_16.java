/* 16. Check whether a character is an alphabet, digit or special character */

import java.util.*;
public class check_Character_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.print("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.print("Digit");
        } else
            System.out.print("special Character");
        sc.close();
    }
}
