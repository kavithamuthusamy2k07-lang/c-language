import java.util.*;
public class EcomfreeShip {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int cartvalue=sc.nextInt();
       int premiumMem=sc.nextInt();
       if(cartvalue>999 ||premiumMem==1){
        System.out .print("Free Shipping");
       }
       else{
         System.out .print("charges Applied");
       }
       sc.close();
    }
}
