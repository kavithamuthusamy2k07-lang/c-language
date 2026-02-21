#include<stdio.h>
#include<limits.h>

int main() {
    int size;
    int max_salary=0;
    scanf("%d",&size);
    int arr[size];
    int second_max_salary=INT_MIN;
    int first_max_salary=INT_MIN;
    for ( int  i=0;i<size;i++)
        {
        scanf("%d",&arr[i]);
        if (arr[i]>first_max_salary){//old max is second max
            second_max_salary=first_max_salary;
            first_max_salary=arr[i];

        }
        else if (arr[i]>second_max_salary&&arr[i]!=first_max_salary){
                second_max_salary=arr[i];
            }
        }

    printf("%d is the second highest salary\n",second_max_salary);
    return 0;
}


