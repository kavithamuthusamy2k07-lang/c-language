#include<stdio.h>
int main(){
    int total_patients_perDay;
    int crowd_days;
    int sum=0;
    int count=0;
    scanf("%d",&crowd_days);
    for(int i=1;i<=crowd_days;i++){
        scanf("%d",&total_patients_perDay);
        sum=sum+total_patients_perDay;            
        if(total_patients_perDay>100) 
        {
          count++;
        }  
    }
  printf("\nTotal_patients:%d",sum);
  printf("\novercrowded days:%d",count);
}