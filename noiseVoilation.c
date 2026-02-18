#include<stdio.h>
int main(){
  int i=1,num_noise;
  int noise_per_mins;
  int count=0;
  int highest_noise=0;
  int current_streak=0;
  scanf("%d",&num_noise);
  while(i<=num_noise)
  {
       scanf("%d",&noise_per_mins);
  
  if(noise_per_mins>70){
    count++;
    current_streak++;
  
      if(current_streak>highest_noise){
    
       highest_noise=current_streak;
       }
  }
      else{
       current_streak=0;
        }
       i++;
    }
printf("\nNoise voilation:%d",count);
printf("\nlongest voilation:%d",highest_noise);

return 0;
}