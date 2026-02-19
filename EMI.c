#include<stdio.h>
int main(){
    int num_months;
    scanf("%d",&num_months);
    int i=1;
    int payments;
    int current_streak=0;
    int max_streak=0;
   
    
       while(i<=num_months)
        {
         scanf("%d",&payments);
         if(payments==0||payments==1)
         {
           if(payments==0){
              current_streak++;
             if(current_streak>max_streak){
              max_streak=current_streak;
             }
           }
          else{
             current_streak=0;
           }
        }
      else 
        {
        printf("invalid input\n");
        }
    i++;
}
printf("\nlongest_default_streak:%d",max_streak);
return 0;
}