#include<stdio.h>
int main() {
    int delay_days;
    scanf("%d",&delay_days);
    int i=1;
    int delay_hrs;
    int sum=0;
    int count=0;
    while (i<=delay_days) {
        scanf("%d",&delay_hrs);
        sum=sum+delay_hrs;
        if (delay_hrs>2) {
            count++;
        }
        i++;
    }
    printf("total_days:%d\n",sum);
    printf("delayed_days:%d",count);
    return 0;
}
