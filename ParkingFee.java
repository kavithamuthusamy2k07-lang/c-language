import java.util.*;

public class ParkingFee {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double totalrevenue = 0.0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            String vehicleType = sc.next();
            double hrsParked = sc.nextDouble();

            int hoursRate = 0;
            int dailyCap = 0;

            // Assign BOTH rate and cap
            if (vehicleType.equals("Car")) {
                hoursRate = 3;
                dailyCap = 30;
            }
            else if (vehicleType.equals("Motorcycle")) {
                hoursRate = 2;
                dailyCap = 20;
            }
            else if (vehicleType.equals("Truck")) {
                hoursRate = 5;
                dailyCap = 60;
            }
            else if (vehicleType.equals("Bus")) {
                hoursRate = 7;
                dailyCap = 100;
            }

            double fee = hrsParked * hoursRate;
            boolean capApplied = false;

            if (fee > dailyCap) {
                fee = dailyCap;
                capApplied = true;
            }

            totalrevenue += fee;

            if (hrsParked > 8) {
                count++;
            }

            System.out.println("Vehicle " + (i + 1) + ": " + vehicleType);
            System.out.println("Hours Parked: " + hrsParked);
            System.out.println("Hourly Rate: $" + hoursRate);
            System.out.println("Parking Fee: $" + fee);
            System.out.println("Cap Applied: " + (capApplied ? "Yes" : "No"));
            System.out.println();
        }

        double averagefee = totalrevenue / n;

        System.out.println("Total Vehicles: " + n);
        System.out.println("Total Revenue: $" + totalrevenue);
        System.out.printf("Average Fee: $%.2f\n", averagefee);
        System.out.println("Peak Hour Vehicles (>8 hours): " + count);

        sc.close();
    }
}