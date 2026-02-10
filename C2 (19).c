#include<stdio.h>
int main() {
    int a;
    printf("enter the no of attempts;");
    scanf("%d",&a);
    if (a>3) {
        printf("account locked");
    }

    else if (a<=3&&a>0) {
        printf("login allowed");
    }
    else {
        printf("invalid input");

    }
    return 0;
}