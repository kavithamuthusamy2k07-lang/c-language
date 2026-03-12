
import java.util.Scanner;

public class ShippingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        sc.nextLine();
        String zone = sc.nextLine();
        String speed = sc.nextLine();
        String size = sc.nextLine();

        double baseRate = 0;
        double zoneMultiplier = 1.0;
        double sizeSurcharge = 0;
        int deliveryDays = 0;
        String serviceLevel = "";

        // Base Rate by Speed
        if(speed.equals("Economy")){
            baseRate = 5;
            serviceLevel = "Budget";
        } 
        else if(speed.equals("Standard")){
            baseRate = 10;
            serviceLevel = "Standard";
        }
        else if(speed.equals("Express")){
            baseRate = 25;
            serviceLevel = "Priority";
        }
        else if(speed.equals("Overnight")){
            baseRate = 50;
            serviceLevel = "Premium";
        }

        // Weight surcharge
        double weightSurcharge = weight * 1;

        // Zone Multiplier
        if(zone.equals("Local"))
            zoneMultiplier = 1.0;
        else if(zone.equals("Regional"))
            zoneMultiplier = 1.2;
        else if(zone.equals("National"))
            zoneMultiplier = 1.5;
        else if(zone.equals("International"))
            zoneMultiplier = 3.0;

        // Size surcharge
        if(size.equals("Small"))
            sizeSurcharge = 0;
        else if(size.equals("Medium"))
            sizeSurcharge = 5;
        else if(size.equals("Large"))
            sizeSurcharge = 15;
        else if(size.equals("Oversized"))
            sizeSurcharge = 30;

        // Delivery time
        if(speed.equals("Economy")){
            if(zone.equals("Local")) deliveryDays = 7;
            else if(zone.equals("Regional")) deliveryDays = 7;
            else if(zone.equals("National")) deliveryDays = 10;
            else deliveryDays = 21;
        }
        else if(speed.equals("Standard")){
            if(zone.equals("Local")) deliveryDays = 3;
            else if(zone.equals("Regional")) deliveryDays = 5;
            else if(zone.equals("National")) deliveryDays = 7;
            else deliveryDays = 14;
        }
        else if(speed.equals("Express")){
            if(zone.equals("Local")) deliveryDays = 1;
            else if(zone.equals("Regional")) deliveryDays = 2;
            else if(zone.equals("National")) deliveryDays = 2;
            else deliveryDays = 5;
        }
        else if(speed.equals("Overnight")){
            deliveryDays = 1;
        }

        double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
        double totalCost = baseCost + sizeSurcharge;

        System.out.println("Package Weight: " + weight + " lbs");
        System.out.println("Destination Zone: " + zone);
        System.out.println("Shipping Speed: " + speed);
        System.out.println("Package Size: " + size);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery: " + deliveryDays + " business days");
        System.out.println("Service Level: " + serviceLevel);
    }
}