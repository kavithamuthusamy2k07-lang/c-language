import java.util.*;
public class CreditCard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
          
            int creditLimit=sc.nextInt();
              int purchase=sc.nextInt();
            int blocked=sc.nextInt();
            if(purchase>creditLimit||blocked==1)
           {
            System.out.print("Decline");
           }
           else{
            System.out.print("Approved");
           }
sc.close();
        }
    }

