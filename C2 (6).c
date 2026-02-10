#include<stdio.h>
int main() {
    int a;
    printf("ticket status:");
    scanf("%d",&a);
    if (a>0) {
        printf("confirmed");
    }
    else if (a<=0) {
        printf("waiting list");
    }
    else {
        printf("invalid");

    }
    return 0;
}