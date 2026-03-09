
import java.util.Scanner;

public class LoanPreScreening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double debtToIncomeRatio = sc.nextDouble();
        sc.nextLine(); // consume newline
        String loanType = sc.nextLine();

        String decision = "";
        double maxLoanAmount = 0;

        // Nested if-else logic for decision
        if (creditScore >= 750) { // Excellent credit
            if (debtToIncomeRatio < 30) {
                decision = "Approved";
            } else {
                decision = "Needs Review";
            }
        } else if (creditScore >= 650) { // Good credit
            if (debtToIncomeRatio < 35) {
                decision = "Approved";
            } else if (debtToIncomeRatio <= 45) {
                decision = "Needs Review";
            } else {
                decision = "Rejected";
            }
        } else { // Poor credit
            decision = "Rejected";
        }

        // Adjustments based on loan type
        if (decision.equals("Approved") || decision.equals("Needs Review")) {
            if (loanType.equalsIgnoreCase("Personal")) {
                maxLoanAmount = annualIncome * 0.5;
            } else if (loanType.equalsIgnoreCase("Home")) {
                maxLoanAmount = annualIncome * 4;
            } else if (loanType.equalsIgnoreCase("Business")) {
                maxLoanAmount = annualIncome * 2;
            }
        } else {
            maxLoanAmount = 0;
        }

        // Output
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt-to-Income Ratio: " + debtToIncomeRatio + "%");
        System.out.println("Loan Type: " + loanType);
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + maxLoanAmount);

        sc.close();
    }
}
