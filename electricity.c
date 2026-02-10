#include<stdio.h>
int main ()
{
  int type ;
  int units;
  int bills;
  int a;
  printf("connection type:\n");
  printf("\n1.domestic");
  printf("\n2.commercial");
  printf("\nchoose the connection type");
  scanf("%d",&type);
  
  switch(type)
  {
    case 1:
        
        if(type==1)
        {
            printf("enter the units\n");
            scanf("%d",&units);
            a=(100*3)+((units-100)*5);
            bills=a-80;
            printf("%d",bills);
            break;
        }
        
    case 2:
       
        if(type==2)
        {
            printf("enter the units\n");
            scanf("%d",&units);
            bills=(100*7)+((units-100)*10);
            printf("%d",bills);
            break;
         }
         
    default:
        {
          printf("invalid input!");
        }
    
  }
return 0;
}
