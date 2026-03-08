 import java.util.*;
 public class SmartElectructyAlert {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int ConsumedUnits=sc.nextInt();
       int voltageFluction=sc.nextInt();
       if(ConsumedUnits>500||voltageFluction==1){
        System.out.print("Alert Triggered");
       }
       else{
         System.out.print("Normal Usage");
       }
       sc.close();
    }
}
