/*
 24. Calculate electricity bill based on slab rates.

| Units Consumed           | Rate per Unit |
| ------------------------ | ------------: |
| First 100 units          |            ₹2 |
| Next 100 units (101–200) |            ₹3 |
| Next 200 units (201–400) |            ₹5 |
| Above 400 units          |            ₹7 |

*/

import java.util.*;
public class Calculate_Electricity_Bill_24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Unit Consume: ");

        /* 
        int unit = sc.nextInt();
        int Bill;
        

        if(unit <= 100){
            Bill = unit * 2;
        }
        else if(unit <= 200){
            Bill = 200 + (unit - 100)*3;
        }
        else if(unit <= 400){
            Bill = 500 + (unit - 200)*5;
        }
        else{
            Bill = 1500 + (unit - 400) * 7;
        }
         System.out.print("Total Bill: " + Bill ); */
        
       /*  Question 2 
        //Additional charge 150 Rs
        //500 unit se jyada hone par 10% surcharge lgega total pe
        int unit = sc.nextInt();
        int Bill;
        

        if(unit <= 100){
            Bill = unit * 2;
        }
        else if(unit <= 200){
            Bill = 200 + (unit - 100)*3;
        }
        else if(unit <= 400){
            Bill = 500 + (unit - 200)*5;
        }
        else{
            Bill = 1500 + (unit - 400) * 7;
        }

        double totalSub = Bill + 150;
        double finalBill;

        if(unit > 500){
            double surcharge = totalSub * 0.1;
            finalBill  = totalSub + surcharge; 
        }
        else{
            finalBill = totalSub;
        }
        System.out.print("Total Bill: " + finalBill ); */
        

        /*Question 3 */
        /*
        Additional rules:

Bill ₹500 se kam → 5% rebate
Bill ₹500–₹1500 → no rebate
Bill ₹1500 se zyada → 8% surcharge
Finally ₹100 fixed charge add karo.
        */
        
        int unit = sc.nextInt();
        int Bill;
        

        if(unit <= 100){
            Bill = unit * 2;
        }
        else if(unit <= 200){
            Bill = 200 + (unit - 100)*3;
        }
        else if(unit <= 400){
            Bill = 500 + (unit - 200)*5;
        }
        else{
            Bill = 1500 + (unit - 400) * 7;
        }
        double totalSub = Bill + 100;
        double finalBill;

        if(totalSub < 500){
            double rebate = totalSub *0.05;
            finalBill = totalSub-rebate;
        }
        else if(totalSub  <= 1500){
            finalBill = totalSub;
        }
        else {
            finalBill = totalSub + (totalSub * 0.08);
        }
        
        System.out.println("Total Bill: " + finalBill);
    }
}

