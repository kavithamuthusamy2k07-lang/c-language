#include<stdio.h>
int main()
{
    int b;
    scanf("%d",&b);
    int c;
    scanf("%d",&c);
    int sum=0;
    
    for(int i=b;i<=c;i++){
        
       if(i%b==0)
       {
        sum=sum+i;
       }
    
    }
    printf("%d",sum);
return 0;
}