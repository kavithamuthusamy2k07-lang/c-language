import java.util.Scanner;

public class CloudStorageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int storage = sc.nextInt();
        int users = sc.nextInt();
        sc.nextLine();
        String backup = sc.nextLine();
        String support = sc.nextLine();

        double storageCost = 0;

        if(storage <= 100)
            storageCost = storage * 0.05;
        else if(storage <= 500)
            storageCost = (100 * 0.05) + (storage - 100) * 0.04;
        else if(storage <= 2000)
            storageCost = (100 * 0.05) + (400 * 0.04) + (storage - 500) * 0.03;
        else
            storageCost = (100 * 0.05) + (400 * 0.04) + (1500 * 0.03) + (storage - 2000) * 0.02;

        double perUserFee;

        if(users <= 10)
            perUserFee = users * 5;
        else if(users <= 50)
            perUserFee = users * 4;
        else
            perUserFee = users * 3;

        double backupPremium = 0;

        if(backup.equals("Daily"))
            backupPremium = 0;
        else if(backup.equals("Hourly"))
            backupPremium = 15 + (0.5 * users);
        else if(backup.equals("Real-Time"))
            backupPremium = 50 + (1 * users);

        double supportFee = 0;

        if(support.equals("Community"))
            supportFee = 0;
        else if(support.equals("Standard"))
            supportFee = 20;
        else if(support.equals("Priority"))
            supportFee = 75;
        else if(support.equals("Enterprise"))
            supportFee = 200;

        double monthly = storageCost + perUserFee + backupPremium + supportFee;
        double annual = monthly * 12 * 0.9;

        String plan;
        String features;

        if(users == 1){
            plan = "Personal";
            features = "Basic storage, file sync";
        }
        else if(users <= 20){
            plan = "Team";
            features = "Version history, file sharing, basic analytics";
        }
        else if(users <= 100){
            plan = "Business";
            features = "Advanced sharing, team analytics, priority support";
        }
        else{
            plan = "Enterprise";
            features = "Advanced security, compliance tools, dedicated support, API access";
        }

        System.out.println("Storage Capacity: " + storage + " GB");
        System.out.println("User Count: " + users);
        System.out.println("Backup Frequency: " + backup);
        System.out.println("Support Tier: " + support);
        System.out.println("Base Storage Cost: $" + storageCost);
        System.out.println("Per-User Fee: $" + perUserFee);
        System.out.println("Backup Premium: $" + backupPremium);
        System.out.println("Support Fee: $" + supportFee);
        System.out.println("Monthly Subscription: $" + monthly);
        System.out.println("Annual Subscription: $" + annual + " (save 10%)");
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Included Features: " + features);
    }
}