import java.util.*;
public class SecurityPermission {
    public static void main(String ags[]){
        Scanner sc=new Scanner(System.in);
       int permissionA=sc.nextInt();
       int permissionB=sc.nextInt();
       int mergedPermissionCode=permissionA|permissionB;
        System.out.print(mergedPermissionCode);
       
       sc.close();

    }
    }
