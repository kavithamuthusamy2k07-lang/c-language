import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();
        String season = sc.nextLine();
        String payment = sc.nextLine();

        double r1=0,r2=0,r3=0,r4=0;

        if(type.equals("Residential")){
            r1=0.10; r2=0.15; r3=0.25; r4=0.30;
        }
        else if(type.equals("Commercial")){
            r1=0.12; r2=0.18; r3=0.25; r4=0.25;
        }
        else{
            r1=0.08; r2=0.12; r3=0.20; r4=0.20;
        }

        double t1=0,t2=0,t3=0,t4=0;

        if(units>0){
            if(units<=100)
                t1 = units*r1;
            else
                t1 = 100*r1;
        }

        if(units>100){
            if(units<=300)
                t2 = (units-100)*r2;
            else
                t2 = 200*r2;
        }

        if(units>300){
            if(units<=500)
                t3 = (units-300)*r3;
            else
                t3 = 200*r3;
        }

        if(units>500){
            t4 = (units-500)*r4;
        }

        double subtotal = t1+t2+t3+t4;

        int seasonal = 0;
        if(season.equals("Summer")) seasonal=15;
        else if(season.equals("Winter")) seasonal=-10;

        subtotal = subtotal + (subtotal*seasonal/100.0);

        int discount=0;
        if(payment.equals("Auto-Pay")) discount=5;
        else if(payment.equals("Online")) discount=3;

        double total = subtotal - (subtotal*discount/100.0);

        double avg = total/units;

        System.out.println("Units Consumed: "+units+" kWh");
        System.out.println("Customer Type: "+type);
        System.out.println("Season: "+season);
        System.out.println("Payment Method: "+payment);
        System.out.println("Tier 1 Cost (0-100): $"+t1);
        System.out.println("Tier 2 Cost (101-300): $"+t2);
        System.out.println("Tier 3 Cost (301-500): $"+t3);
        System.out.println("Tier 4 Cost (501+): $"+t4);
        System.out.println("Seasonal Adjustment: "+seasonal+"%");
        System.out.println("Payment Discount: "+discount+"%");
        System.out.printf("Total Bill: $%.2f\n",total);
        System.out.printf("Average Rate: $%.2f/kWh\n",avg);
    }
}