#include<stdio.h>
int main()
{
int salary;
printf("enter your salary:");
scanf("%d",&salary);
if (salary>30000)
{
printf("bonus is eligible ");
}
else
{
printf("bonus is not eligible");
}
return 0;
}
