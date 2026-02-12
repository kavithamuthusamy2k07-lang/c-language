#include<stdio.h>
int main()
{
  int amt;
  int speed;
  printf("enter the amount:");
  
  scanf("%d",&amt);
  printf("enter the speed:");
  
  scanf("%d",&speed);
  switch(speed)
  { 
    case 1:
        if(speed==1)
        {
           printf("delivery $50");
           break;       
        }
    
    case 2:
        if(speed==2&&amt<1000)
        {
            printf("delivery $100");
            break;    
        }
        else if(speed==2&&amt>=1000)
        {
            printf("delivery free");
            break;
        }
        else{
            printf("try again");
            break;
        }
        
        
    
   }
   
   return 0;

}