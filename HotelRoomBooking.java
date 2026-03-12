 import java.util.Scanner;
 public class HotelRoomBooking {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String roomCategory=sc.nextLine();
       String season=sc.nextLine();
       int nightsBooked=sc.nextInt();
       sc.nextLine();
       String loyalityTier=sc.nextLine();
       //season rate
       double baseRate=0;
       if(roomCategory.equals("Standard")){
        baseRate=150;
       }
       else if(roomCategory.equals("Deluxe")){
        baseRate=300;
       }
       else if(roomCategory.equals("Suite")){
        baseRate=500;
       }
       else if(roomCategory.equals("Presidential")){
        baseRate=1000;
       }
       //season multilpier
       double SeasonMultiplier=0;
       if(season.equals("Off-Peak")){
         SeasonMultiplier=0.7;
       }
       else  if(season.equals("Regular")){
         SeasonMultiplier=1.0;
       }
       else  if(season.equals("Peak")){
         SeasonMultiplier=1.5;
       }
       else  if(season.equals("Holiday")){
         SeasonMultiplier=1.0;
       }
       //extended discount rate
       double ExtendedDiscount=0;
       if(nightsBooked>=1&&nightsBooked<=4){
        ExtendedDiscount=0;
       }
       else if(nightsBooked>=5&&nightsBooked<=7){
         ExtendedDiscount=5;
       }
        else if(nightsBooked>=8&&nightsBooked<=14){
         ExtendedDiscount=10;
       }
        else if(nightsBooked>=15){
         ExtendedDiscount=20;
       }
       //loyalty discount
       double loyalityDiscount=0;
       String upgrades="None";
       if(loyalityTier.equals("None")){
             loyalityDiscount=0;
       }
       else if(loyalityTier.equals("Member")){
             loyalityDiscount=10;
             upgrades="Free breakfast";
       }
       else if(loyalityTier.equals("Gold")){
        loyalityDiscount=15;
        upgrades = "Free breakfast and spa access";
       }
       else if(loyalityTier.equals("Platinum")){
        loyalityDiscount=20;
         upgrades = "Concierge service, airport transfer, and fine dining";
       }

       //calcution
       double seasonRate=baseRate*SeasonMultiplier;
       double discountedRate=seasonRate*(1-ExtendedDiscount/100)*(1-loyalityDiscount/100);
       double totalcost=discountedRate*nightsBooked;
       
        // Output
        System.out.println("Room Category: " + roomCategory);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nightsBooked);
        System.out.println("Loyalty Tier: " + loyalityTier);
        System.out.println("Base Rate Per Night: $" + baseRate);
        System.out.println("Seasonal Multiplier: " + SeasonMultiplier + "x");
        System.out.println("Extended Stay Discount: " + ExtendedDiscount + "%");
        System.out.println("Loyalty Discount: " + loyalityDiscount + "%");
        System.out.println("Nightly Rate: $" + discountedRate);
        System.out.println("Total Booking Cost: $" + totalcost);
        System.out.println("Complimentary Upgrades: " + upgrades);

        sc.close();

    }
}
