import java.util.*;

public class SmartHome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String timeOfDay = sc.nextLine();
        double powerConsumption = sc.nextDouble();
        double renewablePercentage = sc.nextDouble();
        sc.nextLine();
        String rateTier = sc.nextLine();

        double baseRate = 0;

        // Base rate
        if(rateTier.equals("Basic"))
            baseRate = 0.18;
        else if(rateTier.equals("Time-of-Use"))
            baseRate = 0.15;
        else if(rateTier.equals("Premium-Green"))
            baseRate = 0.12;

        // Rate multiplier
        double multiplier = 1.0;

        if(timeOfDay.equals("Peak")){
            if(rateTier.equals("Time-of-Use"))
                multiplier = 1.8;
            else
                multiplier = 1.5;
        }
        else if(timeOfDay.equals("Off-Peak")){
            if(rateTier.equals("Time-of-Use"))
                multiplier = 0.8;
            else
                multiplier = 1.0;
        }
        else if(timeOfDay.equals("Super-Off-Peak")){
            if(rateTier.equals("Premium-Green"))
                multiplier = 0.6;
            else
                multiplier = 0.5;
        }

        double renewableCredit =
                (powerConsumption * renewablePercentage / 100.0) * baseRate;

        double totalCost =
                (powerConsumption * baseRate * multiplier) - renewableCredit;

        if(totalCost < 0)
            totalCost = 0;

        // Recommendation
        String recommendation;

        if(timeOfDay.equals("Peak") && renewablePercentage < 30){
            recommendation = "Shift high-power appliances to Off-Peak hours";
        }
        else if(renewablePercentage > 50){
            recommendation = "Excellent! Maximize appliance use during this period";
        }
        else if(rateTier.equals("Basic")){
            recommendation = "Consider upgrading to Time-of-Use plan";
        }
        else{
            recommendation = "Good timing! Consider increasing renewable capacity";
        }

        // Potential savings
        double potentialSavings = 0;

        if(timeOfDay.equals("Peak")){
            double offPeakMultiplier = 0.8;
            double offPeakCost =
                    (powerConsumption * baseRate * offPeakMultiplier) - renewableCredit;

            if(offPeakCost < 0)
                offPeakCost = 0;

            potentialSavings = totalCost - offPeakCost;
        }

        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.println("Base Rate: $" + baseRate + "/kWh");
        System.out.println("Rate Multiplier: " + multiplier + "x");
        System.out.println("Renewable Credit: $" + String.format("%.2f", renewableCredit));
        System.out.println("Total Cost: $" + String.format("%.2f", totalCost));
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.println("Potential Savings: $" + String.format("%.2f", potentialSavings));
        sc.close();
    }
}
