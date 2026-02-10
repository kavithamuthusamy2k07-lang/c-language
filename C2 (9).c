#include<stdio.h>
int main() {
    int a;
    printf("no.of days:");
    scanf("%d",&a);
    if (a>0&&a<10) {
        printf("no fine");
    }
    else if (a>=10) {
        printf("fine applied");
    }
    else {
        printf("invalid input");
    }
    return 0;
}