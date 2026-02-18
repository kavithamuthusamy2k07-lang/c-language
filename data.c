#include<stdio.h>
int main()
{
  int num_days;
  int total_data;
  int daily_data_usage;
  int count=0;
  int i=1;
  printf("enter the total data:\n");
  scanf("%d",&total_data);
  printf("enter the num days data used\n");
  scanf("%d",&num_days);
  printf("enter the daily data used\n");
  while(i<=num_days){
    
    scanf("%d",&daily_data_usage);
     
  
    if(daily_data_usage<=total_data)
    {
     total_data=total_data-daily_data_usage;
     count++;
   }
   else{
    total_data=0;
   }
 i++;
}

  
 
  
  printf("days used:%d\n",count);
  printf("reamining data:%d\n",total_data);
  return 0;
}

