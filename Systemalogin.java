import java.util.*;
public class Systemalogin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int usernameMAtch=sc.nextInt();
        int passwordMAtch=sc.nextInt();
        int accountLocked=sc.nextInt();
        if(usernameMAtch==1&&passwordMAtch==1&&accountLocked!=1){
               System.out.print("Login Success");
        }
        else{
            System.out.print("Login Failed");
        }
        sc.close();
    }
}
