

import java.util.*;
public class ElectrictyBill{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     String Category="";
     double bill=0;
    int totalUnits=0;
    double totalRevenue=0;
    for(int i=0;i<n;i++){
    String consumerID=sc.next();
    double units=sc.nextInt();
      // Tiered pricing calculation
            if (units <= 100) {
                bill = units * 0.10;
            } else if (units <= 200) {
                bill = (100 * 0.10) + (units - 100) * 0.13;
            } else if (units <= 300) {
                bill = (100 * 0.10) + (100 * 0.13) + (units - 200) * 0.16;
            } else {
                bill = (100 * 0.10) + (100 * 0.13) + (100 * 0.16) + (units - 300) * 0.20;
            }


   
     if(units<=200){
        Category="Low Usage";
     }
     else if(units>=201&&units<=300){
        Category="Medium Usage";
     }
     else if(units>300){
        Category="High Usage";
     }

     
       System.out.println("Consumer ID: " + consumerID);
            System.out.println("Units Consumed: " + units);
            System.out.println("Bill Amount: $" + bill);
            System.out.println("Category: " + Category);
            System.out.println();

            // Accumulate totals
            totalUnits += units;
            totalRevenue += bill;
        }

        // Final summary
        double averageBill = totalRevenue / n;

        System.out.println("Total Consumers: " + n);
        System.out.println("Total Units Consumed: " + totalUnits);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.printf("Average Bill: $%.2f\n", averageBill);

        sc.close();
    }
}
