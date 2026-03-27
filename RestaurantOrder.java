 import java.util.*;
 public class RestaurantOrder {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
   
       double grandTotal=0;
        double subTotal=0;
        double serviceCharge=0;
       double  tax=0;
       double totalItems=0;
       for(int i=0;i<N;i++){
        String name=sc.next();
        double price=sc.nextDouble();
        int quantity=sc.nextInt();
         subTotal += price*quantity;
         totalItems += quantity;


        System.out.println("Item: "+name);
       System.out.println("Price: $" + price + " x " + quantity);
        System.out.println();

       }
       tax=subTotal*0.08;
       serviceCharge=subTotal*0.10;
       grandTotal=subTotal+tax+serviceCharge;
       System.out.println("Total Items:"+totalItems);
       System.out.println("SubTotal: "+subTotal);
       System.out.println("Tax: "+tax);
       System.out.println("Service Charge: "+serviceCharge);
       System.out.println("Grfand Total:"+grandTotal);
       sc.close();


    }
}
