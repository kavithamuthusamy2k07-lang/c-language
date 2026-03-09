import java.util.Scanner;
public class EmployeePerformance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int performRate=sc.nextInt();
        int yearsOfservice=sc.nextInt();
        sc.nextLine();
        String departType=sc.nextLine();
        double bonusPercent=0.0;
        double baseSalary=sc.nextDouble();
        boolean eligible=false;
        if(performRate>=4)
            {
             if(yearsOfservice>=5)
                 {
                if(departType.equals("Critical")){
                    bonusPercent=25.0;
                }
                else{
                    bonusPercent=20.0;

                }
                 eligible=true;  
             }
            else
            {
              if(departType.equals("Critical")){
                    bonusPercent=15.0;
                }
                else{
                    bonusPercent=10.0;

                }
         eligible=true;
        }
    }
        else if(performRate==3)
            {
           if(yearsOfservice>=3)
            {
                if(departType.equals("Critical"))
                    {
                    bonusPercent=10.0;
                }
                else{
                    bonusPercent=5.0;

                }
                 eligible=true;  
            
           }
           else
            {
            eligible=false;
           }
        }
        else{
            eligible=false;
        }
        double bonusAmount=eligible?(baseSalary*bonusPercent/100):0.0;

      
        System.out.println("Performance Rate:"+performRate);
        System.out.println("Years of Service:"+yearsOfservice);
        System.out.println("Departmant:"+departType);
        System.out.println("Bonus Percentage: " + (eligible ? bonusPercent + "%" : "0%"));
        System.out.println("Bonus Amount: $" + bonusAmount);
        System.out.println("Status: " + (eligible ? "Eligible" : "Not Eligible"));
        sc.close();


        }
    }