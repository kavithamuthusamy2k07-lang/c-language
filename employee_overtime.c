#include<stdio.h>
int main() {
    int per_days;
    int overTime_hrs;
    scanf("%d",&overTime_hrs);
    int i=1;
    int count=0;
    int sum=0;
    while (i<=overTime_hrs) {
        scanf("%d",&per_days);
        sum+=per_days;
        if (per_days>4) {
            count++;
        }
        i++;
    }
    printf("total over time:%d\n",sum);
    printf("burnout days:%d",count);
    return 0;
}