#include<stdio.h>
int main() {
    int amount;
    printf("enter the amount");
    scanf("%d",&amount);
    if (amount>=100) {
        printf("valid amount");
    }
    else if (amount<100&&amount>=1) {
        printf("not an validd amount");
    }
    else {
        printf("invalid input");
    }
    return 0;
}