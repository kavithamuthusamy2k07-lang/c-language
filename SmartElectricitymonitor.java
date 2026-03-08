 import java.util.*;
 public class SmartElectricitymonitor {
   public  static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int connectionValue=sc.nextInt();
    int applianceMask=sc.nextInt();
    if((connectionValue&applianceMask)!=0){
        System.out.print("Appliance Active");
    }
    else{
          System.out.print("Appliance Active");
    }
    sc.close();
   } 
}
