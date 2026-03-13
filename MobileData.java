import java.util.*;

public class MobileData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double data = sc.nextDouble();
        int minutes = sc.nextInt();
        sc.nextLine();
        String intl = sc.nextLine();
        String device = sc.nextLine();

        String plan="";
        double base=0;

        if(data<=2){
            plan="Basic 2GB";
            base=25;
        }
        else if(data<=5){
            plan="Standard 5GB";
            base=40;
        }
        else if(data<=25){
            plan="Premium Unlimited";
            base=70;
        }
        else{
            plan="Unlimited Max";
            base=90;
        }

        double dataOver=0;
        if(plan.equals("Standard 5GB") && data>5)
            dataOver=(data-5)*10;

        double callOver=0;
        if(minutes>1000)
            callOver=(minutes-1000)*0.05;

        double intlFee=0;
        if(intl.equals("Light")) intlFee=5;
        else if(intl.equals("Moderate")) intlFee=15;
        else if(intl.equals("Heavy")) intlFee=30;

        double deviceFee=0;
        if(device.equals("Smartphone")) deviceFee=10;
        else if(device.equals("Tablet")) deviceFee=10;
        else if(device.equals("Hotspot")) deviceFee=20;

        double total = base + dataOver + callOver + intlFee + deviceFee;

        String category="";
        if(plan.equals("Basic 2GB")) category="Budget";
        else if(plan.equals("Standard 5GB")) category="Standard";
        else if(plan.equals("Premium Unlimited")) category="Premium";
        else category="Unlimited";

        double savings=0;
        if(plan.equals("Standard 5GB") && data>5) savings=5;

        System.out.println("Data Usage: "+data+" GB");
        System.out.println("Call Minutes: "+minutes+" minutes");
        System.out.println("International Usage: "+intl);
        System.out.println("Device Type: "+device);
        System.out.println("Recommended Plan: "+plan);
        System.out.println("Base Plan Cost: $"+base);
        System.out.println("Data Overage: $"+dataOver);
        System.out.println("Call Overage: $"+callOver);
        System.out.println("International Fee: $"+intlFee);
        System.out.println("Device Fee: $"+deviceFee);
        System.out.println("Total Monthly Cost: $"+total);
        System.out.println("Potential Savings: $"+savings);
        System.out.println("Plan Category: "+category);
    }
}