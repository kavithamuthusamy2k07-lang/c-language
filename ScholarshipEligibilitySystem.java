import java.util.Scanner;

public class ScholarshipEligibilitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        double gpa = sc.nextDouble();
        double familyIncome = sc.nextDouble();
        int extracurricularScore = sc.nextInt();
        sc.nextLine(); // consume newline
        String scholarshipType = sc.nextLine();

        String eligibility = "Not Eligible";
        double awardAmount = 0.0;
        String awardCategory = "None";

        // Nested logic for scholarship eligibility and award
        if (scholarshipType.equalsIgnoreCase("Merit")) {
            if (gpa >= 3.5) {
                eligibility = "Eligible";
                if (gpa >= 3.8) {
                    awardAmount = 25000.0;
                    awardCategory = "Full";
                } else {
                    awardAmount = 15000.0;
                    awardCategory = "Partial";
                }
            }
        } else if (scholarshipType.equalsIgnoreCase("Need-Based")) {
            if (familyIncome <= 30000.0) {
                eligibility = "Eligible";
                if (familyIncome <= 20000.0) {
                    awardAmount = 20000.0;
                    awardCategory = "Full";
                } else {
                    awardAmount = 10000.0;
                    awardCategory = "Partial";
                }
            }
        } else if (scholarshipType.equalsIgnoreCase("Sports")) {
            if (extracurricularScore >= 70) {
                eligibility = "Eligible";
                if (extracurricularScore >= 90) {
                    awardAmount = 20000.0;
                    awardCategory = "Full";
                } else if (extracurricularScore >= 80) {
                    awardAmount = 15000.0;
                    awardCategory = "Partial";
                } else {
                    awardAmount = 8000.0;
                    awardCategory = "Minimal";
                }
            }
        }

        // Output
        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + familyIncome);
        System.out.println("Extracurricular Score: " + extracurricularScore);
        System.out.println("Scholarship Type: " + scholarshipType);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Award Amount: $" + awardAmount);
        System.out.println("Award Category: " + awardCategory);

        sc.close();
    }
}