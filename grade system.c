#include<stdio.h>
int main (){
    int mark;
    printf("enter your mark:\n");
    scanf("%d",&mark);
    switch(mark/10)
    {
      case 1:
         if(mark>=91&&mark<=100)
         {
            printf("grade A");
            break;
         }
      
      case 2:
         if(mark>=81&&mark<=90)
         {
            printf("grade B");
            break;
         }
      case 3:
         if(mark>=71&&mark<=80)
         {
            printf("grade c");
            break;
         }
      case 4:
         if(mark>=61&&mark<=70)
         {
            printf("grade D");
            break;
         }
      case 5:
         if(mark>=51&&mark<=60)
         {
            printf("grade E");
            break;
         }
      case 6:
         if(mark>=41&&mark<=50)
         {
            printf("grade F");
            break;
         }
      case 7:
         if(mark>=31&&mark<=39)
         {
            printf("Supplementary");
            break;
         }
      case 8:
         if(mark<=30)
         {
            printf("Fail");
            break;
         }

    }
  return 0;
}