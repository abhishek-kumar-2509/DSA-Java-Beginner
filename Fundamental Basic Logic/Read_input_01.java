/* 1. Read and print different types of input */
import java.util.Scanner;                          //import java package
public class Read_input_01 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Full Name : ");
        String name = sc.nextLine();
        
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();
        
        System.out.print("Enter your 10th Board Percentage : ");
        double percent = sc.nextDouble();
        
        System.out.print("Enter Grade(Out of A,B,C,D) : ");
        char grade = sc.next().charAt(0);
        
        System.out.print("Enter your Status(true/false) : ");
        boolean pass = sc.nextBoolean();
        
        
        System.out.println("\n******************************");
        System.out.println("Full Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("10th Board Percengate " + percent);
        System.out.println("Grade : " + grade);
        System.out.println("Status : " + pass);

        sc.close();
    }
}