#include<stdio.h>
int  main(){
    int actType;
    int balance;
    int withdrawAmount;
    printf("The acccount type:\n");
    printf("1.Savings Account\n");
    printf("2.withdrawal account\n");
    printf("enter the account type:\n");
     
    scanf("%d",&actType);
    switch(actType)
    {
      case 1:
         if (actType==1)
         {
            
            printf("enter your balance:\n");
            scanf("%d",&balance);
            printf("enter the withdrawal amount:\n");
            scanf("%d",&withdrawAmount);
            printf("AccountType:1\n");
            printf("Balance:%d\n",balance);
            printf("WithdrawalAmount:%d",withdrawAmount);
            if(balance>=withdrawAmount)
            {
              printf("\nTransaction successfull");
              
            }
            else{
                printf("no sufficient amount");
            }
            break;
         }
         case 2:
           if(actType==2){
            
            printf("enter your balance:\n");
            scanf("%d",&balance);
            printf("enter the withdrawal amount:\n");
            scanf("%d",&withdrawAmount);
            printf("AccountType:2\n");
            printf("Balance:%d\n",balance);
            printf("WithdrawalAmount:%d\n",withdrawAmount);
            if(balance>=withdrawAmount&&withdrawAmount<5000)
            {
              printf("Transaction successfull");
              
            }
            else{
                printf(" daily limit exceeded");
            }
            break;
        }

    }
return 0;
}