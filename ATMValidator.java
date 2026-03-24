import java.util.Scanner;

public class ATMValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        int n = sc.nextInt();
 
        int success = 0, failed = 0;
        double totalWithdrawn = 0;

        for (int i = 1; i <= n; i++) {
            double amount = sc.nextDouble();

            System.out.println("Transaction " + i + ": $" + amount);

            if (amount <= balance) {
                // Approved
                balance -= amount;
                totalWithdrawn += amount;
                success++;

                System.out.println("Status: Approved");
                System.out.println("Remaining Balance: $" + balance);
            } else {
                // Denied
                failed++;

                System.out.println("Status: Denied");
                System.out.println("Reason: Insufficient funds");
                System.out.println("Remaining Balance: $" + balance);
            }

            System.out.println(); // blank line after each transaction
        }

        // Final Summary
        System.out.println("Total Transactions: " + n);
        System.out.println("Successful Withdrawals: " + success);
        System.out.println("Failed Withdrawals: " + failed);
        System.out.println("Final Balance: $" + balance);
        System.out.println("Total Withdrawn: $" + totalWithdrawn);

        sc.close();
    }
}