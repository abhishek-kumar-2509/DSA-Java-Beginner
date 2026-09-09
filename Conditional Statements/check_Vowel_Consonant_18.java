/* 18. Check whether a character is a vowel or consonant */

import java.util.*;
public class check_Vowel_Consonant_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alphabet: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.print("Vowel");
        } else
            System.out.print("Consonant");
        sc.close();
    }
}
