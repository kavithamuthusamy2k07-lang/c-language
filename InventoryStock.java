import java.util.*;
public class InventoryStock {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int restock=0;
        int low=0;
        int critical=0;
        int totalReorder=0;
        String status="";
       for (int i=0;i<n;i++){
        String productName=sc.next();
        int currentStock=sc.nextInt();
        int minimumStock=sc.nextInt();
        if(currentStock>=minimumStock){
          status="Adequate";
            restock=0;
        }
        else if(currentStock>=minimumStock/2){
          status="Low Stock";
           restock=(minimumStock-currentStock)+( minimumStock/2);
           low++;
        }
        else{
            status="Critical";
            restock=( minimumStock - currentStock ) + (int)( minimumStock*1.5);
            critical++;
        }
            totalReorder+=restock;
           System.out.println("Product: "+productName);
           System.out.println("Current Stock: "+currentStock);
           System.out.println("Minimum Stock: "+minimumStock);
           System.out.println("Status : "+status);
           System.out.println("Reorder Quantity: "+restock);
           System.out.println();


      }
  
      System.out.println("Total Products: "+n);
      System.out.println("Low Stock Items: "+low);
      System.out.println("Critical Items: "+critical);
      System.out.println("Total Reorder Quantity: "+totalReorder);
    }
    }
