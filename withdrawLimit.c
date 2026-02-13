#include<stdio.h>
int main(){
    int no_of_withdrawal,sum=0,amt_withdraw;
    printf("enter the no_of_withdrawal:");
    scanf("%d",&no_of_withdrawal);
    for(int i=1;i<=no_of_withdrawal;i++)
    {
      scanf("%d",&amt_withdraw);
      sum=sum+amt_withdraw;
      
    }
    if(sum<=10000)
    {
        printf("Approved");
    }
    else
    {
        printf("limit exceeded");
    }
 return 0;
}