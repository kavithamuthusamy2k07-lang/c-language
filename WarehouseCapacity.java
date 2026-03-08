import java.util.*;
public class WarehouseCapacity {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);      
      int basebox=sc.nextInt();
        int levels=sc.nextInt();
        int capacity=basebox<<levels;
        System.out.print(capacity);
        sc.close();
    }
}
