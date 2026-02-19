#include<stdio.h>
int main( ){
int total_failures;
scanf("%d",&total_failures);
int i=1;
int current_streak=0;
int failures;
int max_streak=0;
printf("enter 1(working) and 0(failed)\n");
while(i<=total_failures){
   
   scanf("%d",&failures);
if(failures==0){
    current_streak++;
    if(current_streak>max_streak){
    max_streak=current_streak;
 }
}

else{
   current_streak=0;
}
i++;
}
 
printf("longest streak:%d",max_streak);

return 0;
}






