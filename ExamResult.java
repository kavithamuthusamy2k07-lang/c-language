import java.util.Scanner;
public class ExamResult {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int theory=sc.nextInt();
        int practicle=sc.nextInt();
        int avg=(theory+practicle)/2;
        if((theory>=50&&practicle>=50)&&(avg>=60))
        {
            System.out.print("pass");
        }
        else{
            System.out.print("fail");
        }
        sc.close();
    }
}
