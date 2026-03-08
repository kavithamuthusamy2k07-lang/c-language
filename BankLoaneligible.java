
import java.util.*;
public class BankLoaneligible {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        int Reqloan=sc.nextInt();
        int creditScore=sc.nextInt();
        if(Reqloan>25000&&creditScore>700){
            System.out.print("Loan Approved");
        }
        else{
            System.out.print("not Approved");
        }
        sc.close();

    }

}
