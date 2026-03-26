import java .util.*;
public class TicketBooking {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double ticketPrice=0;
        double totalOriginal=0;
        double finalTotal=0;
        double totalDiscount=0;
        String groupDiscount="";
             
            double baseAmount=0;
            double discount=0;
            
         for(int i=1;i<=n;i++){
            String seatType=sc.next();
            String customerType=sc.next();
            
              if(seatType.equals("Regular")){
                baseAmount=12;

            }
            else if(seatType.equals("Premium")){
                baseAmount=18;
            }           
             else if(seatType.equals("Recliner")){
                baseAmount=25;
            } 
        
            if(customerType.equals("Adult")){
                discount=0;
            }
            else if(customerType.equals("Child")){
                discount=18;
            }
             else if(customerType.equals("Senior")){
                discount=25;
            }
            if(n >= 5){
                finalTotal = finalTotal * 0.9;
               groupDiscount = "Yes";
              } else {
                 groupDiscount = "No";
          }
        
          
           
            ticketPrice=baseAmount*(1-discount/100);
            totalOriginal+=baseAmount;
            finalTotal+=ticketPrice;
         
 

            System.out.println("Ticket "+i+ ":" +seatType+ "-" +customerType);
            System.out.println("Base price: "+baseAmount);
            System.out.println("Discount: "+discount);
            System.out.println("Final Amount: "+ticketPrice);
         }
        totalDiscount=totalOriginal-finalTotal;
         System.out.println("Total Tickets: "+n);
         System.out.println("Original Total: "+totalOriginal);
         System.out.println("Total Discount: "+totalDiscount);
         System.out.println("Final Total: "+finalTotal);
         System.out.println("Group Discount Applied: "+groupDiscount);
         sc.close();
    }
}
