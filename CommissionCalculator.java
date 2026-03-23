import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totalSales = 0;
        double totalCommissions = 0;
        String topPerformer = "";
        double maxSales = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            double sales = sc.nextDouble();

            double rate = 0;
            double bonus = 0;

            // Determine commission rate
            if (sales <= 40000) {
                rate = 5;
            } else if (sales <= 80000) {
                rate = 8;
            } else if (sales <= 100000) {
                rate = 10;
            } else if (sales <= 150000) {
                rate = 12;
            } else {
                rate = 15;
            }

            // Calculate commission
            double commission = sales * rate / 100;

            // Determine bonus
            if (sales >= 150000) {
                bonus = 3000;
            } else if (sales >= 100000) {
                bonus = 2000;
            }

            double totalPayout = commission + bonus;

            // Print details
            System.out.println("Sales Rep: " + name);
            System.out.println("Sales Amount: $" + sales);
            System.out.println("Commission Rate: " + (int)rate + "%");
            System.out.println("Commission Earned: $" + commission);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + totalPayout);
            System.out.println();

            // Accumulate totals
            totalSales += sales;
            totalCommissions += commission;

            // Track top performer
            if (sales > maxSales) {
                maxSales = sales;
                topPerformer = name;
            }
        }

        // Final summary
        System.out.println("Total Sales Reps: " + n);
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Commissions: $" + totalCommissions);
        System.out.println("Top Performer: " + topPerformer);

        sc.close();
    }
}