import java.util.Scanner;

public class ParkingFee{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String locationZone=sc.nextLine();
        double parkingHrs=sc.nextDouble();
        sc.nextLine();
        String vehicleType=sc.nextLine();
        String membershipStatus=sc.nextLine();

        double basehrs=5;

        // zone premium
        String category="";
        double zonePremium=0;
        double dailyCap=0;
 
        if(locationZone.equals("Downtown")){
            zonePremium=50;
            category="Premium";
            dailyCap=150;
        }
        else if(locationZone.equals("Business-District")){
            zonePremium=30;
            category="Premium";
            dailyCap=120;
        }
        else if(locationZone.equals("Residential")){
            zonePremium=0;
            category="Standard";
            dailyCap=60;
        }
        else if(locationZone.equals("Airport")){
            zonePremium=100;
            category="Luxury";
            dailyCap=180;
        }

        // vehicle surcharge
        double vehicleSizeSurCharge=0;

        if(vehicleType.equals("Motorcycle")){
            vehicleSizeSurCharge=-2;
        }
        else if(vehicleType.equals("Compact")){
            vehicleSizeSurCharge=0;
        }
        else if(vehicleType.equals("Sedan")){
            vehicleSizeSurCharge=0;
        }
        else if(vehicleType.equals("SUV")){
            vehicleSizeSurCharge=3;
        }
        else if(vehicleType.equals("Oversized")){
            vehicleSizeSurCharge=5;
        }

        // raw fee
        double rawFee=(basehrs*(1+zonePremium/100)+vehicleSizeSurCharge)*parkingHrs;

        // membership discount
        double memberShip=0;

        if(membershipStatus.equals("None")){
            memberShip=0;
        }
        else if(membershipStatus.equals("Monthly")){
            memberShip=20;
        }
        else if(membershipStatus.equals("Annual")){
            memberShip=25;
        }
        else if(membershipStatus.equals("VIP")){
            memberShip=30;
        }

        double discountedFee = rawFee*(1-memberShip/100);

        double finalFee = discountedFee;
        String dailyCapApply="No";

        if(parkingHrs>=24){
            if(discountedFee>dailyCap){
                finalFee=dailyCap;
                dailyCapApply="Yes";
            }
        }

        System.out.println("Location Zone: " + locationZone);
        System.out.println("Parking Duration: " + parkingHrs + " hours");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Membership Status: " + membershipStatus);
        System.out.println("Base Hourly Rate: $" + basehrs);
        System.out.println("Zone Premium: " + (int)zonePremium + "%");
        System.out.println("Vehicle Size Surcharge: $" + vehicleSizeSurCharge);
        System.out.println("Membership Discount: " + (int)memberShip + "%");
        System.out.println("Total Parking Fee: $" + finalFee);
        System.out.println("Daily Cap Applied: " + dailyCapApply);
        System.out.println("Rate Category: " + category);

        sc.close();
    }
}