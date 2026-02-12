#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int digit;
    int c=0;
    for(;n!=0;n=n/10){
      digit=n%10;
      c=c+digit;
         
    }
   printf("%d\n",c); 
return 0;
}