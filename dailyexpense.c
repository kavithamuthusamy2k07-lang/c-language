#include<stdio.h>
int main()
{
    int days;
    int daily_expenses;
    int count=0;
    int sum=0;
    scanf("%d",&days);
    
    for (int i=1;i<=days;i++){

      
        scanf("%d",&daily_expenses);
    
        sum=sum+daily_expenses;
        
        if(daily_expenses>1000){
            count++;
        }
    }
      printf("total expenses:%d\n",sum);
      printf("overspend days:%d",count);
    return 0;
}