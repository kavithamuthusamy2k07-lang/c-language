#include<stdio.h>
int main(){
    int class;
    int age;
    printf("enter the class:\n");
    scanf("%d",&class);
    switch(class)
    {
        case 1:
          if(class==1)
          {
            printf("enter your age:\n");
            scanf("%d",&age);
            if(age>=60)
            {
                printf("fare:%d",300-99);
            }
            else if(age<=12)
            {
                printf("fare:%d",300-150);
            }
          }
          break;
        case 2:
          if(class==2)
          {
            printf("enter your age:\n");
            scanf("%d",&age);
            if(age<=12&&age>=1)
            {
                printf("fare:%d",1000-500);
                break;
            }
            else if(age>=60&&age<=100)
            {
                printf("fare:%d",1000);
                break;
            }

            
          }

  
    }
return 0;
}