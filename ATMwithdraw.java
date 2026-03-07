import java.util.Scanner;
public class ATMwithdraw {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int accBal=sc.nextInt();
        int withdraw=sc.nextInt();
        int dailylimit=sc.nextInt();
        if(withdraw<=accBal && withdraw<=dailylimit)
        {
            System.out.print("Transaction Approved");
        }
        else
        {
            System.out.print("Transaction  not Approved");

         }
         sc.close();
        }
    }

