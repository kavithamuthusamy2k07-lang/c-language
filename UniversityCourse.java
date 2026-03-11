 import java.util.Scanner;
 public class UniversityCourse {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String studentStatus=sc.nextLine();
       int creditHours=sc.nextInt();
       sc.nextLine();
       String programType=sc.nextLine();
       String residency=sc.nextLine();

       double baseTutionFee=0;
       double residencyMulti=0.0;
       double programFee=0;
       double activityFee=0;
       double tutionCost=0;
       String category;
//base  tution
      if(programType.equals("Undergraduate")){
                baseTutionFee=350;
              
       }
      else if(programType.equals("Graduate")){
              
                  baseTutionFee=550;
      }
       else if(programType.equals("Professional")){
              
                  baseTutionFee=800;
                 
       }
//residency
     if(residency.equals("In-State")){
       residencyMulti=1.0;
     }
     else if(residency.equals("Out-of-State")){
            residencyMulti=2.5;
         }
      else if(residency.equals("International")){
            residencyMulti=3.0;
      }
 

   //tutuionFee
    
            tutionCost=creditHours*baseTutionFee*residencyMulti;
   
    //program fee and activity fee
      if(studentStatus.equals("Full-time")){
         activityFee=200;
         if(programType.equals("Undergraduate")){
            programFee=500;
         }
         else if(programType.equals("Graduate")){
            programFee=750;
         }
         else if(programType.equals("Professional")){
            programFee=1200;
         }
      }
       else if(studentStatus.equals("Part-time")){
         activityFee=100;
         if(programType.equals("Undergraduate")){
            programFee=300;
         }
         else if(programType.equals("Graduate")){
            programFee=750;
         }
         else if(programType.equals("Professional")){
            programFee=900;
         }
      }
       else if(studentStatus.equals("Continuing-Education")){
         activityFee=50;
         programFee = 150;

        
      }
      //category
    if(studentStatus.equals("Continuing-Education")){
      category="Reduced";

    }
    else if(residency.equals("Out-of-State")||residency.equals("International")){
      category="Premium";
      
    }
    else{
      category="Standard";
    }

   double totalFee=tutionCost+programFee+activityFee;
      
    System.out.println("Student status: "+studentStatus);
    System.out.println("Credit hours: "+creditHours);
    System.out.println("Program type: "+programType);
    System.out.println("Residency: "+residency);
    System.out.println("Base tutiion per credit:$ "+baseTutionFee);
    System.out.println("Residency multiplier: "+residencyMulti);
    System.out.println("Program Fee:$ "+programFee);
    System.out.println("Student activity fee:$ "+activityFee);
    System.out.println("Total Registration Fee:$ "+totalFee);
    System.out.println("Fee Category: "+category);
    sc.close();
      }
   }
              

              
              
              
              
              

      
       