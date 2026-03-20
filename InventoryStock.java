import java.util.*;
public class InventoryStock {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String status="";
        int restock=0;
        int low=0;
        int critical=0;
        String reorderCategory="";
       for (int i=0;i<n;i++){
        String productName=sc.nextLine();
        int currentStock=sc.nextInt();
        int minimumStock=sc.nextInt();
        if(currentStock>=minimumStock){
          status="Adequate";
        }
        else if(currentStock<minimumStock&&currentStock>=minimumStock/2){
          status="Low Stock";
        }
        else if(currentStock<minimumStock){
            status="Critical";
        }
         if (reorderCategory.equals("Adequate")){
             restock=0;
           }
         else  if (reorderCategory.equals("Low Stock")){
             restock=(minimumStock-currentStock)x minimumStock/2;
             low++;

           }
        if (reorderCategory.equals("Critical")){
             restock=(minimumStock-currentStock)x minimumStock*1.5;
            critical++;
           }
      }
    }
    }
