import java.util.*;
public class GovernmentScholarship {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Income=sc.nextInt();
        int Percentage=sc.nextInt();

        if(Income < 200000 && Percentage >=75){
            System.out.print(" Granted");
        }
        else{
             System.out.print(" Not Granted");
        }
        sc.close();
    }
}
