

import java.util.Scanner;

public class ParkingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totalRevenue = 0;
        int peakHourCount = 0;

        for (int i = 1; i <= n; i++) {
            String type = sc.next();
            double hours = sc.nextDouble();

            double rate = 0;
            double cap = 0;

            // Assign rate and cap based on vehicle type
            switch (type) {
                case "Car":
                    rate = 3.0;
                    cap = 30.0;
                    break;
                case "Motorcycle":
                    rate = 2.0;
                    cap = 20.0;
                    break;
                case "Truck":
                    rate = 5.0;
                    cap = 60.0;
                    break;
                case "Bus":
                    rate = 7.0;
                    cap = 100.0;
                    break;
            }

            double fee = hours * rate;
            boolean capApplied = false;

            if (fee > cap) {
                fee = cap;
                capApplied = true;
            }

            // Count peak hour vehicles
            if (hours > 8) {
                peakHourCount++;
            }

            totalRevenue += fee;

            // Output per vehicle
            System.out.println("Vehicle " + i + ": " + type);
            System.out.println("Hours Parked: " + hours);
            System.out.println("Hourly Rate: $" + rate);
            System.out.println("Parking Fee: $" + fee);
            System.out.println("Cap Applied: " + (capApplied ? "Yes" : "No"));
            System.out.println();
        }

        double average = totalRevenue / n;

        // Final summary
        System.out.println("Total Vehicles: " + n);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.printf("Average Fee: $%.2f\n", average);
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakHourCount);

        sc.close();
    }
}