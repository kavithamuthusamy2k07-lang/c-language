#include<stdio.h>
int main()
{
int a;
printf("enter the battery value");
scanf("%d",&a);
if(a<20)
{
printf("low battery");
}
else if(a>=20&&a<=100)
{
printf("battery ok");
}
else
{
  printf("invalid input");
}
return 0;
}