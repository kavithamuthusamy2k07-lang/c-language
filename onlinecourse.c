#include<stdio.h>
int main() {
    int num_weeks;
    scanf("%d",&num_weeks);
    int count=0;
    int studied_hrs;
    int i=1;
    while (i<=num_weeks) {
        scanf("%d",&studied_hrs);
        if (studied_hrs==0) {
            count++;

        }

        i++;
    }
    if (studied_hrs==0) {
        printf("risk status:high\n");
    }

    else {
        printf("risk status:low\n");
    }

    printf("inactive weeks:%d",count);
    return 0;

}