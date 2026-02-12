#include<stdio.h>
int main()
{   
    int a;
    int b;
    printf("enter the designation code:");
    scanf("%d",&a);
    printf("\nenter the experience:");
    scanf("%d",&b);
    switch(a){
        case 1:
           if(b>=3){
            printf("salary:%d",50000+(5000*b));
            break;
           }
        case 2:
           if(b>=3){
            printf("salary:%d",35000+(5000*b));
            break;
           }   
    }
    return 0;
}