import java.util.*;
public class EmployeeOvertimeBonus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Workinghrs=sc.nextInt();
        int attend=sc.nextInt();
        if(Workinghrs>40&&attend>=90){
            System.out.print("eligible");
        }
        else{
             System.out.print(" not eligible");
        }
        sc.close();
    }
}
