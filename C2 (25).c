#include<stdio.h>
int main() {
    int a;
    printf("enter the water level:");
    scanf("%d",&a);
    if (a>=90) {
        printf("waring");

    }
    else if (a>0&&a<90) {
        printf("normal");
    }
    else {
        printf("invalid");
    }
    return 0;
