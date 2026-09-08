/* 3. Calculate the area and perimeter of a circle  */
import java.util.Scanner;
public class Area_Perimeter_Circle_03 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Radius Of Circle: ");
      int radius = sc.nextInt();
      double area = 3.14 * radius*radius;      // area of circle = pie(3.14) * r * r
      double perimeter  = 2 * 3.14 * radius;

      System.out.println("Area of circle: " + area);
      System.out.println("Perimeter of circle: " + perimeter);

      sc.close();

   }    
}
