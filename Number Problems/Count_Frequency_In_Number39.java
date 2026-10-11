/* 39. Find the frequency of every digit from 0 to 9 */

import java.util.*;
public class Count_Frequency_In_Number39 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int freq[] = new int[10];

        if(n==0){
            freq[0] = 1;
        }
        while(n>0){
            int digit = n % 10;
            freq[digit]++;
            n/=10;
        }
        System.out.println();
        for(int i =0; i < 10; i++){
            System.out.println(i+" Occurs " + freq[i] + " times");
        }
        sc.close();
    }
}