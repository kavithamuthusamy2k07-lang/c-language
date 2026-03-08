import java.util.*;
public class DigitalSignalControl {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int signalValue=sc.nextInt();
    int toggleMask=sc.nextInt();
    int Signal=signalValue^toggleMask;
    System.out.print(Signal);
    sc.close();
   } 
}
