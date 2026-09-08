/* * 7. Convert temperature from Celsius to Fahrenheit and vice versa   */
import java.util.*;
public class Convesion_Temperature_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* 
        System.out.print("Enter Celsius Temperature: ");
        double celsius = sc.nextDouble();

        double F = (celsius * 9/5) + 32;
        System.out.println("Celsius is Equal to " + F+" F");    */
        
        
        System.out.print("Enter Fahrenheit Temperature: ");
        double Fahrenheit = sc.nextDouble();
        
        double celsius = ( Fahrenheit- 32)*9/5;
        System.out.println("Fahrenheit is Equal to " + celsius +" °C");

        sc.close();
    }    
}