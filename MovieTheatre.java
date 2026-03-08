  import java.util.*;
  public class MovieTheatre {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int IDproof=sc.nextInt();
        if(age>=18&&IDproof==1){
          System.out.print("Entry allowed");
        }
        else{
            System.out.print("Entry Denied");
        }
        sc.close();
    }
}
