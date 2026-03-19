import java.util.*;
public class EmployeeSalary{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int NumEmployee=sc.nextInt();
        double sum=0;
    
        for(int i=0;i<NumEmployee;i++){
         String EmployeeName=sc.nextLine();
        double baseSalary=sc.nextDouble();
        int performRate=sc.nextInt();
        double increment=0;
          
          if (performRate==5){
             increment=15 ; 
          }
        else  if (performRate==4){
             increment=10 ; 
          }
        else  if (performRate==3){
             increment=5 ; 
          }
        else if (performRate==2){
             increment=2; 
          }
          else{
            increment=0;
          }
        
        double finalSalary=baseSalary*(1+increment/100);
        sum=sum+finalSalary;

        System.out.println("Employee: "+EmployeeName);
        System.out.println("Base Salary:$ "+baseSalary);
        System.out.println("Performance: "+performRate);
        System.out.println("Increament: "+increment+"%");
        System.out.println("Final Salary:$ "+finalSalary);

    }
    double average=sum/NumEmployee;
    System.out.println("Total Employees Processed: "+NumEmployee);
    System.out.println("Total Payroll: $"+sum);
    System.out.println("Average salary: $"+String.format("%.2f", average));
    sc.close();
}
}
