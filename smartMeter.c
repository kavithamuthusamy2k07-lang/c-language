#include<stdio.h>
int main() {
    int total_power_hrs;
    scanf("%d",&total_power_hrs);
    int per_hr;
    int i=1;
    int max_usage=0;
    int current_usage=0;
    int count=0;
    while (i<=total_power_hrs) {
        scanf("%d",&per_hr);
        if (per_hr>5) {
            count++;
            if (per_hr>max_usage) {
                max_usage=per_hr;

            }
        }
        i++;
    }
    printf("max usage:%d\n",max_usage);
    printf("surge hours:%d",count);
    return 0;
}
