/* 23. Calculate grade based on marks */
/* A1: 91–100 marks (10 Grade Points)
   A2: 81–90 marks (9 Grade Points)
   B1: 71–80 marks (8 Grade Points)
   B2: 61–70 marks (7 Grade Points)
   C1: 51–60 marks (6 Grade Points)
   C2: 41–50 marks (5 Grade Points)
   D: 33–40 marks (4 Grade Points - Minimum Pass)
   E1 / E2: Below 33 marks (Fail) */
import java.util.*;
public class Calculate_Grade_23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int mark = sc.nextInt();

        if(mark > 90 && mark <=100){
            System.out.println("Grade A1");
        }
        else if(mark > 80 && mark <= 90){
            System.out.println("Grade A2");
        }
        else if(mark > 70 && mark <= 80){
            System.out.println("Grade B1");
        }
        else if(mark > 60 && mark <= 70){
            System.out.println("Grade B2");
        }
        else if(mark > 50 && mark <= 60){
            System.out.println("Grade C1");
        }
        else if(mark > 40 && mark <= 50){
            System.out.println("Grade C2");
        }
        else if(mark > 32 && mark <= 40){
            System.out.println("Grade D");
        }
        else if(mark >=0 && mark < 33){
            System.out.println("Fail");
        }
        else
            System.out.println("Invalid Marks!");

        sc.close();
    }
}
