 import java.util.Scanner;

public class HotelOccupancyTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totalOccupancyRate = 0;
        double maxRate = 0;
        int peakDay = 0;
        int fullDays = 0;

        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int occupied = sc.nextInt();
            int total = sc.nextInt();

            double rate = (occupied * 100.0) / total;

            String status;
            if (rate < 60) {
                status = "Low";
            } else if (rate < 80) {
                status = "Moderate";
            } else if (rate < 100) {
                status = "High";
            } else {
                status = "Full";
            }

            // Print details
            System.out.println("Day: " + day);
            System.out.println("Rooms Occupied: " + occupied);
            System.out.println("Total Rooms: " + total);
            System.out.println("Occupancy Rate: " + rate + "%");
            System.out.println("Status: " + status);
            System.out.println();

            // Accumulate
            totalOccupancyRate += rate;

            // Track peak day
            if (rate > maxRate) {
                maxRate = rate;
                peakDay = day;
            }

            // Count full capacity days
            if (rate == 100.0) {
                fullDays++;
            }
        }

        double avgRate = totalOccupancyRate / n;

        // Round to 2 decimal places where needed
        System.out.println("Total Days Analyzed: " + n);
        System.out.printf("Average Occupancy Rate: %.2f%%\n", avgRate);
        System.out.println("Peak Occupancy Day: Day " + peakDay);
        System.out.println("Days at Full Capacity: " + fullDays);

        sc.close();
    }
} 
