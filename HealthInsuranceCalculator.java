import java.util.Scanner;

public class HealthInsuranceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int age = sc.nextInt();
        sc.nextLine(); // consume newline
        String smokingStatus = sc.nextLine();
        String preExistingConditions = sc.nextLine();
        String coverageTier = sc.nextLine();

        double basePremium = 0;
        double riskSurcharge = 0;

        // Determine base premium based on coverage tier and age
        if (coverageTier.equalsIgnoreCase("Basic")) {
            if (age < 30) {
                basePremium = 200;
            } else if (age <= 45) {
                basePremium = 250;
            } else if (age <= 60) {
                basePremium = 300;
            } else {
                basePremium = 350;
            }
        } else if (coverageTier.equalsIgnoreCase("Standard")) {
            if (age < 30) {
                basePremium = 300;
            } else if (age <= 45) {
                basePremium = 350;
            } else if (age <= 60) {
                basePremium = 450;
            } else {
                basePremium = 500;
            }
        } else if (coverageTier.equalsIgnoreCase("Premium")) {
            if (age < 30) {
                basePremium = 400;
            } else if (age <= 45) {
                basePremium = 500;
            } else if (age <= 60) {
                basePremium = 600;
            } else {
                basePremium = 700;
            }
        }

        // Risk surcharge based on smoking status and pre-existing conditions
        if (smokingStatus.equalsIgnoreCase("Smoker")) {
            riskSurcharge += basePremium * 0.3; // 30% surcharge for smokers
        }

        if (preExistingConditions.equalsIgnoreCase("Yes")) {
            riskSurcharge += basePremium * 0.2; // 20% surcharge for pre-existing conditions
        }

        double totalPremium = basePremium + riskSurcharge;

        // Output
        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smokingStatus);
        System.out.println("Pre-existing Conditions: " + preExistingConditions);
        System.out.println("Coverage Tier: " + coverageTier);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Risk Surcharge: $" + riskSurcharge);
        System.out.println("Total Monthly Premium: $" + totalPremium);

        sc.close();
    }
}