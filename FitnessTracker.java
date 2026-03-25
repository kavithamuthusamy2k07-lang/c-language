 import java.util.*;
 public class FitnessTracker {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    
      int totalCalories=0;
      int totalDuration=0;
      for(int i=1;i<=n;i++){
          String exerciseType=sc.next();
          int durationMins=sc.nextInt();
          int calories=0;
          String intensity="";
        
          if(exerciseType.equals("Running")){
           calories=10*durationMins;
            intensity="High intensity";
          }
          else if(exerciseType.equals("Swimming")){
            calories=12*durationMins;
              intensity="High intensity";
          }
           else if(exerciseType.equals("Cycling")){
           calories=8*durationMins;
              intensity="Moderate intensity";
          }
            else if(exerciseType.equals("Gym")){
            calories=7*durationMins;
              intensity="Moderate intensity";
          }
           else if(exerciseType.equals("Walking")){
            calories=4*durationMins;
              intensity="Low intensity";
          }
          totalCalories+=calories;
          totalDuration+=durationMins;
          System.out.println("Session : "+i+":"+exerciseType);
          System.out.println("Duration : " + durationMins + " minutes");
          System.out.println("Calories: "+calories);
          System.out.println("Intensity: "+intensity);
          System.out.println();

      } 
       
      double average=(double)totalCalories/n;
      String level="";
      if(totalCalories<300){
          level="Beginner";
      }
       else if(totalCalories>=300&&totalCalories<=1000){
          level="Intermediate";
      }
      else if(totalCalories>1000)
      {
        level="Advanced";
      }
     
     System.out.println("Total Workouts: "+n);

     System.out.println("Total Durations: "+totalDuration);

     System.out.println("Total Calories: "+totalCalories);

     System.out.println("Average Calories per session: "+average);

     System.out.println("Fitness level: "+level);

     sc.close();
    }
}
