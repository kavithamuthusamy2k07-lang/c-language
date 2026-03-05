import java.util.Scanner;

public class HospitalBillEstimator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double roomCharge = sc.nextDouble();
        int days = sc.nextInt();
        double medicineCost = sc.nextDouble();
        double labFees = sc.nextDouble();
        double insuranceCoverage = sc.nextDouble();

        double totalBill = (roomCharge * days) + medicineCost + labFees - insuranceCoverage;

        System.out.println("Payable Amount = " + (int)totalBill);
    }
}