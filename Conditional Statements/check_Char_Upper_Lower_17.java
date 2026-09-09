/*17. Check whether a character is uppercase or lowercase 
     */

import java.util.*;
public class check_Char_Upper_Lower_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Alphabet: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }
        sc.close();
    }
}
