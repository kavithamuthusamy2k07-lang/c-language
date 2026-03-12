import java.util.Scanner;
 public class CreditCard {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String cardTier=sc.nextLine();
        String purchaseCategory=sc.nextLine();
        double transactionAmt=sc.nextDouble();
        sc.nextLine();
        String promotionalStatus=sc.nextLine();
        //base rate and tier multiplexer
        double baseTier=0;
        double tierMulti=0;
        String rewardTier="";
        if(cardTier.equals("Basic")){
            tierMulti=1.0;
            baseTier=1.0;
            rewardTier="Standard";
        }
        else if(cardTier.equals("Gold")){
            tierMulti=1.25;
             baseTier=1.0;
            rewardTier="Enhanced";
        }
        else if(cardTier.equals("Platinum")){
            tierMulti=1.5;
             baseTier=1.0;
              rewardTier="Premium";
        }
        else if(cardTier.equals("Black")){
            tierMulti=2.0;
             baseTier=1.0;
            rewardTier="Elite";
        }
    

        
       //category  bonus
       double categoryBonus=0;
       if(purchaseCategory.equals("Groceries")){
           categoryBonus=2.0;
       }
       else if(purchaseCategory.equals("Dining")){
           categoryBonus=2.5;
       }
       else if(purchaseCategory.equals("Travel")){
           categoryBonus=3.0;
       }
       else if(purchaseCategory.equals("Gas")){
           categoryBonus=2.0;
       }
       else if(purchaseCategory.equals("Other")){
           categoryBonus=1.0;
       }
       //promotional multiplexer
       double promotionalMulti=0;
       if(promotionalStatus.equals("None")){
        promotionalMulti=1.0;
       }
       else if(promotionalStatus.equals("Double-Points")){
        promotionalMulti=2.0;
       }
        else if(promotionalStatus.equals("Triple-Points")){
        promotionalMulti=3.0;
       }


       double pointsEarned=transactionAmt*baseTier*categoryBonus*tierMulti*promotionalMulti;
       double cashValue=pointsEarned*0.01;
       System.out.println("Card Tier: "+cardTier);
       System.out.println("Purchase Category: "+purchaseCategory);
       System.out.println("Transaction Amount:$"+transactionAmt);
       System.out.println("Promotional Status: "+promotionalStatus);
       System.out.println("Base Points: "+baseTier);
       System.out.println("Category Bonus: "+categoryBonus+"x");
       System.out.println("Tier Multiplier: "+tierMulti+"x");
       System.out.println("Promotional Multiplier: "+promotionalMulti+"x");
       System.out.println("Points Earned: "+ pointsEarned);
       System.out.println("Equivalent Cash Value:$"+cashValue);
       System.out.println("Rewards Points: "+rewardTier);
       sc.close();



    }

}
