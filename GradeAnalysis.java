import java.util.*;
public class GradeAnalysis {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    String grade="";
    String status="";
    int sum=0;
    int Pass=0;
    int Fail=0;
    int maximum=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
 
    String SName=sc.next();
    int SScore=sc.nextInt();
    if(SScore>=85&&SScore<=100){
        grade="A";
    }
    else if(SScore>=70&&SScore<=84){
        grade="B";
    }
     else if(SScore>=60&&SScore<=69){
        grade="C";
    }
     else if(SScore>=50&&SScore<=59){
        grade="D";
    }
     else if(SScore>=0&&SScore<=49){
        grade="F";
    }
    if(SScore>=60){
        status="Pass";
        Pass++;
    }
    else if(SScore<60){
        status="Fail";
        Fail++;
    }
    sum+=SScore;
      maximum =Math.max(maximum,SScore); 
    System.out.println("Student: "+SName);
    System.out.println("Student Score: "+SScore);
    System.out.println("Letter Grade: "+grade);
    System.out.println("Status: "+status);
  
   
    }
    double average=sum/n;
    System.out.println("Total Students: "+n);
    System.out.println("Class Average: "+average);
    System.out.println("Highest Score: "+maximum) ;
    System.out.println("Students Failed:"+Fail);
     System.out.println("Students Passed:"+Pass);
     sc.close();
   } 
}
