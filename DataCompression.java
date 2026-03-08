import java.util.*;
public class DataCompression {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int filesize=sc.nextInt();
        int compersion=sc.nextInt();
        int size=filesize>>compersion;
        System.out.print(size);
        sc.close();
    }
}
