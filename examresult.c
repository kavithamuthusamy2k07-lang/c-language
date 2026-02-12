#include<stdio.h>
int main (){
    int mark;
    int attendance;
    printf("enter your mark:\n");
    scanf("%d",&mark);
    printf("enter your attendance:\n");
    scanf("%d",&attendance);
    switch(mark||attendance)
    {
       
         
       
      case 1:
         if(mark>=75)
         {
            printf("distinction");
            break;
         }
      case 2:
         if(mark>=50&&mark<=70)
         {
            printf("pass");
            break;
         }
      case 3:
         if(mark<50||attendance<75)
         {
            printf("Fail");
            break;
         }

    }
  return 0;
}