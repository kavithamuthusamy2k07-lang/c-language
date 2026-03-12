import java.util.Scanner;
public class GymMemprice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String membership=sc.nextLine();
        int contractMonths=sc.nextInt();
        sc.nextLine();
        String access=sc.nextLine();
        String addOn=sc.nextLine();

        double baseFee=0;
        int contractDiscount=0;
        double accessFee=0;
        double addOnFee=0;
      
        //discount base
       
        if(membership.equals("Basic")){
           baseFee=40;
          
        }
        else if(membership.equals("Premium")){
           baseFee=80;
    
        }
        else if(membership.equals("Elite")){
           baseFee=120;
           
        }
        else if(membership.equals("VIP")){
           baseFee=150;
  
        }

        //contract discount
        if(contractMonths==1){
             contractDiscount=0;
        }
        else if(contractMonths==6){
           
            contractDiscount=10;
        }
         else if(contractMonths==12){
  
          contractDiscount=15;
         }
         else if(contractMonths==24){
        
            contractDiscount=25;
         }
         //access fee
         if(access.equals("Single-Location")){
           accessFee=0;
         }
         else if(access.equals("Regional")){
           accessFee=20;
         }
         else if(access.equals("Nationwide")){
            accessFee=50;
        }
        //addOnFee
         if(addOn.equals("None")){
             addOnFee=0;
        }
         else  if(addOn.equals("Personal-Training")){
             addOnFee=100;
        }
         else  if(addOn.equals("Classes")){
             addOnFee=50;
        }
        else  if(addOn.equals("Full-Package")){
             addOnFee=200;
        }

        //calculation

       double discountedBase=baseFee*(1-contractDiscount/100.0);
       double monthlyTotal=(discountedBase+accessFee+addOnFee);
       double contractTotal=monthlyTotal*contractMonths;
       double savings=(baseFee+accessFee+addOnFee)*contractMonths-contractTotal;

       //membership category based on monthly total
        String membershipCategory;
           if (monthlyTotal <= 60) {
            membershipCategory = "Budget";
        } 
        else if (monthlyTotal <= 130) {
            membershipCategory = "Standard";
        } 
        else if (monthlyTotal <= 200) {
            membershipCategory = "Premium";
        } 
        else {
            membershipCategory = "Luxury";
        } 
         System.out.println("Membership Tier: "+membership);
         System.out.println("Contract Length: "+contractMonths+" months");
         System.out.println("Access Level: "+access);
         System.out.println("Adds-Ons: "+addOn);
         System.out.println("Base Monthly Fee: $" +baseFee);
         System.out.println("Contract Discount: "+contractDiscount+"%");
         System.out.println("Access Fee: $"+accessFee);
         System.out.println("Adds-On Fee: $"+addOnFee);
         System.out.println("Monthly Total: $ "+monthlyTotal);
         System.out.println("Contract Total: $"+contractTotal);
         System.out.println("Savings vs Month-to-Month: $"+savings);
         System.out.println("Membership Category: "+membershipCategory);
         sc.close(); 

    }
}

