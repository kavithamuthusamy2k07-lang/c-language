#include<stdio.h>
int main() {
    int a;
    printf("enter the num:");
    scanf("%d",&a);
    if (a>=1&&a<=5) {
        printf("weekday");

    }
    else if (a==6||a==7) {
        printf("weekend");
    }
    else {
        printf("invalid error");
    }
    return 0;
}