#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int temp=0,first=0,second=1;
    printf("%d",first);
    printf("%d",second);

    
    for(int i=1;i<=n;i++)
    {

        temp=first+second;
        first=second;
        second=temp;
        printf("%d",second);
    }
      
return 0;
}
