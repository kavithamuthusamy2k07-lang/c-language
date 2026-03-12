import java.util.Scanner;

public class MovieTicketPricing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String format = sc.nextLine();
        String time = sc.nextLine();
        String seat = sc.nextLine();
        String customer = sc.nextLine();

        double basePrice = 12;
        double formatSurcharge = 0;
        double seatFee = 0;
        double timeAdjust = 0;
        double discount = 0;

        // Format surcharge
        if(format.equals("2D")) formatSurcharge = 0;
        else if(format.equals("3D")) formatSurcharge = 5;
        else if(format.equals("IMAX")) formatSurcharge = 8;
        else if(format.equals("4DX")) formatSurcharge = 10;

        // Seat fee
        if(seat.equals("Standard")) seatFee = 0;
        else if(seat.equals("Premium")) seatFee = 4;
        else if(seat.equals("Recliner")) seatFee = 7;

        // Time adjustment
        if(time.equals("Matinee")) timeAdjust = -30;
        else if(time.equals("Evening")) timeAdjust = 0;
        else if(time.equals("Prime-Time")) timeAdjust = 20;
        else if(time.equals("Late-Night")) timeAdjust = -20;

        // Customer discount
        if(customer.equals("Adult")) discount = 0;
        else if(customer.equals("Senior")) discount = 25;
        else if(customer.equals("Student")) discount = 15;
        else if(customer.equals("Child")) discount = 30;

        double baseWithSurcharge = basePrice + formatSurcharge + seatFee;
        double adjustedPrice = baseWithSurcharge * (1 + timeAdjust / 100);
        double finalPrice = adjustedPrice * (1 - discount / 100);

        String voucher = "No";
        if(time.equals("Matinee") || customer.equals("Senior") || customer.equals("Student") || customer.equals("Child"))
            voucher = "Yes";

        String category;
        if(finalPrice <= 10) category = "Value";
        else if(finalPrice <= 20) category = "Standard";
        else if(finalPrice <= 30) category = "Premium";
        else category = "Luxury";

        System.out.println("Movie Format: " + format);
        System.out.println("Show Time: " + time);
        System.out.println("Seat Category: " + seat);
        System.out.println("Customer Type: " + customer);
        System.out.println("Base Ticket Price: $" + basePrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatFee);
        System.out.println("Time-Based Adjustment: " + (int)timeAdjust + "%");
        System.out.println("Customer Discount: " + (int)discount + "%");
        System.out.println("Final Ticket Price: $" + finalPrice);
        System.out.println("Concession Voucher: " + voucher);
        System.out.println("Pricing Category: " + category);

    }
} 
