#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int sum=0,digit;

    for(;n!=0;n=n/10)
    {
      digit=n%10;
      sum=sum+digit;

    }
     printf("%d ",sum);
return 0;
}
