import java.util.Scanner;
public class Airline6 {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);

       String bookingClass=sc.nextLine();
       int daysUtilDepature=sc.nextInt();
       double seatAvailability=sc.nextDouble();
       sc.nextLine();
       String routeType=sc.nextLine();

       double basePrice=0.0;
       double demandMulti=1.0;
       String pricingCategory="";

       // Base Price Logic
       if(bookingClass.equals("Business"))
       {
            if(routeType.equals("Domestic")){
                basePrice=600.0;
            }
            else if(routeType.equals("International-Short")){
                basePrice=1500.0;
            }
            else if(routeType.equals("International-Long")){
                basePrice=2500.0;
            }
       }

       else if(bookingClass.equals("First"))
       {
            if(routeType.equals("Domestic")){
                basePrice=1000.0;
            }
            else if(routeType.equals("International-Short")){
                basePrice=3000.0;
            }
            else if(routeType.equals("International-Long")){
                basePrice=5000.0;
            }
       }

       else if(bookingClass.equals("Economy"))
       {
            if(routeType.equals("Domestic")){
                basePrice=200.0;
            }
            else if(routeType.equals("International-Short")){
                basePrice=500.0;
            }
            else if(routeType.equals("International-Long")){
                basePrice=800.0;
            }
       }

       // Demand Multiplier Logic
       if(seatAvailability<30.0 && daysUtilDepature<14){
            demandMulti=1.8;
            pricingCategory="High Demand";
       }
       else if(seatAvailability<50.0 && daysUtilDepature<30){
            demandMulti=1.5;
            pricingCategory="High Demand";
       }
       else if(seatAvailability<60.0 || (daysUtilDepature>=30 && daysUtilDepature<=60)){
            demandMulti=1.3;
            pricingCategory="Moderate";
       }
       else if(seatAvailability>=60.0 && daysUtilDepature>60){
            demandMulti=0.8;
            pricingCategory="Low Demand";
       }

       double finalTicketPrice=basePrice*demandMulti;

       System.out.println("Booking Class: "+bookingClass);
       System.out.println("Days Until Departure: "+daysUtilDepature);
       System.out.println("Seat Availability: "+seatAvailability+"%");
       System.out.println("Route Type: "+routeType);
       System.out.println("Base Price: $"+basePrice);
       System.out.println("Demand Multiplier: "+demandMulti+"x");
       System.out.println("Final Ticket Price: $"+finalTicketPrice);
       System.out.println("Pricing Category: "+pricingCategory);

       sc.close();
    }
}