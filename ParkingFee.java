 import java.util.*;
 public class ParkingFee {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int totalrevenue=0;
    int count=0;
    for(int i=0;i<n;i++){
        String vehicleType=sc.next();
        double hrsParked=sc.nextDouble();
        int hoursRate=0;
        int dailyCap=0;
        Double parkingFee=0.0;
        String capApplied="";
        
        if(vehicleType.equals("car")){
                 hoursRate=3;
                 
        }
        else if(vehicleType.equals("motorcycle")){
            hoursRate=2;
            
        }
        else if(vehicleType.equals("Truck")){
           hoursRate=5;
           
        }
        else if(vehicleType.equals("Bus")){
            hoursRate=7;
        
    }


if(capApplied.equals("Yes")){
          if(vehicleType.equals("car")){
                 
                 dailyCap=30;
        }
        else if(vehicleType.equals("motorcycle")){
            
            dailyCap=20;
        }
        else if(vehicleType.equals("Truck")){
           
           dailyCap=60;
        }
        else if(vehicleType.equals("Bus")){
            
            dailyCap=100;
    }
}
else{
    capApplied="No";
}

   

        double fee=hrsParked*hoursRate;
        double finalFee=Math.min(fee,dailyCap);
                           
        totalrevenue+=finalFee;
        if(hrsParked>8){
            count++;
        }
        System.out.println("Vehicle "+i+ ": "+vehicleType);
        System.out.println("Hours Parked: "+hrsParked);
        System.out.println("Hourly Rate: "+hoursRate);
        System.out.println("Parking Fee: "+parkingFee);
        System.out.println("Cap Applied: "+capApplied);
        System.out.println();
        
    }
    double averagefee=totalrevenue/n;
    System.out.println("Total Vehicles: "+n);
    System.out.println("Total Revenue: "+totalrevenue );
    System.out.println("Average Fee: "+averagefee);
    System.out.println("Peak hours Vehicle: "+count);
    sc.close();

   } 
}
