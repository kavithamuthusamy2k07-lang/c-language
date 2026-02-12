#include<stdio.h>
int main()
{
    int b;
    scanf("%d",&b);
    int fact=1;
    for(int i=1;i<=b;i++){
        
        fact=fact*i;
        printf("%d\n ",fact);
      
    
}
    
return 0;
}