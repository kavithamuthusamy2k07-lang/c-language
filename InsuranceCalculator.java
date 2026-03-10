import java.util.*;

public class InsuranceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int driverAge = sc.nextInt();
        sc.nextLine();
        String vehicleType = sc.nextLine();
        String drivingRecord = sc.nextLine();
        String coverageLevel = sc.nextLine();

        double basePremium = 0;
        double ageFactor = 1.0;
        double vehicleRisk = 1.0;
        int recordAdjust = 0;
        String riskCategory = "";

        // Base premium
        if (coverageLevel.equals("Basic")) {
            basePremium = 500;
        } else if (coverageLevel.equals("Standard")) {
            basePremium = 800;
        } else if (coverageLevel.equals("Comprehensive")) {
            basePremium = 1500;
        }

        // Age factor
        if (driverAge >= 16 && driverAge <= 21) {
            ageFactor = 1.8;
        } else if (driverAge <= 25) {
            ageFactor = 1.5;
        } else if (driverAge <= 40) {
            ageFactor = 1.0;
        } else if (driverAge <= 60) {
            ageFactor = 0.9;
        } else {
            ageFactor = 1.1;
        }

        // Vehicle risk
        if (vehicleType.equals("Sedan")) {
            vehicleRisk = 1.0;
        } else if (vehicleType.equals("SUV")) {
            vehicleRisk = 1.2;
        } else if (vehicleType.equals("Sports")) {
            vehicleRisk = 1.5;
        } else if (vehicleType.equals("Truck")) {
            vehicleRisk = 1.1;
        }

        // Driving record
        if (drivingRecord.equals("Clean")) {
            recordAdjust = -10;
        } else if (drivingRecord.equals("Minor-Violations")) {
            recordAdjust = 25;
        } else {
            recordAdjust = 50;
        }

        double adjustedPremium = basePremium * ageFactor * vehicleRisk;
        double finalPremium = adjustedPremium * (1 + recordAdjust / 100.0);

        double monthlyPremium = finalPremium / 12;
        double annualPremium = finalPremium;

        // Risk category
        if (drivingRecord.equals("Major-Violations") || vehicleType.equals("Sports")) {
            riskCategory = "Very High";
        } else if (driverAge <= 25) {
            riskCategory = "High";
        } else if (drivingRecord.equals("Minor-Violations")) {
            riskCategory = "Medium";
        } else {
            riskCategory = "Low";
        }

        System.out.println("Driver Age: " + driverAge);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Driving Record: " + drivingRecord);
        System.out.println("Coverage Level: " + coverageLevel);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Age Factor: " + ageFactor + "x");
        System.out.println("Vehicle Risk Factor: " + vehicleRisk + "x");
        System.out.println("Record Adjustment: " + recordAdjust + "%");
        System.out.printf("Monthly Premium: $%.2f\n", monthlyPremium);
        System.out.println("Annual Premium: $" + annualPremium);
        System.out.println("Risk Category: " + riskCategory);

        sc.close();
    }
}
