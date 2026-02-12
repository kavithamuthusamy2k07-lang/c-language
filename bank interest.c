#include<stdio.h>
int main()
{
    int accType;
    
    int years;
    scanf("%d",&accType);
  
    scanf("%d",&years);
    switch(accType)
    {
        case 1:
          if(accType==1)
          {
            printf("interest:4");
            break;
          }
        case 2:
          if(accType==2)
          {
            if(years<=3)
            {
                printf("interest:5");
            }
            else
            {
                printf("interest:7");
            }
          }  
          break;
    }
return 0;
}