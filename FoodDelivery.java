import java.util.*;

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double order = sc.nextDouble();
        sc.nextLine();
        String slot = sc.nextLine();
        String weather = sc.nextLine();

        double base = 3.0;
        double distanceFee = distance;

        double peak=0;

        if(slot.equals("Lunch")) peak=2.5;
        else if(slot.equals("Dinner")) peak=2.0;
        else if(slot.equals("Late-Night")) peak=1.5;

        double weatherFee=0;

        if(weather.equals("Rain")) weatherFee=2;
        else if(weather.equals("Snow")) weatherFee=3;
        else if(weather.equals("Storm")) weatherFee=5;

        double discount=0;

        if(order>=75) discount=5;
        else if(order>=50) discount=3;
        else if(order>=30) discount=1;

        double finalFee = base + distanceFee + peak + weatherFee - discount;

        if(finalFee<2.99) finalFee=2.99;

        int time = (int)(distance*8);

        if(slot.equals("Lunch")||slot.equals("Dinner"))
            time+=10;

        if(weather.equals("Rain")) time+=5;
        else if(weather.equals("Snow")) time+=10;
        else if(weather.equals("Storm")) time+=15;

        String priority="Standard";

        if(order>60) priority="Express";
        else if(slot.equals("Lunch")||slot.equals("Dinner")) priority="High";

        System.out.println("Delivery Distance: "+distance+" miles");
        System.out.println("Order Value: $"+order);
        System.out.println("Time Slot: "+slot);
        System.out.println("Weather Condition: "+weather);
        System.out.println("Base Delivery Fee: $"+base);
        System.out.println("Distance Surcharge: $"+distanceFee);
        System.out.println("Peak Time Surcharge: $"+peak);
        System.out.println("Weather Surcharge: $"+weatherFee);
        System.out.println("Order Value Discount: $"+discount);
        System.out.println("Final Delivery Fee: $"+finalFee);
        System.out.println("Estimated Delivery Time: "+time+" minutes");
        System.out.println("Service Priority: "+priority);
    }
}