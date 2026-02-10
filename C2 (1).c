#include<stdio.h>
int main() {
    int a;
    printf("cart value:");
    scanf("%d",&a);
    if (a<499&&a>0) {
        printf("delivery charge apply");

    }
    else if (a>=499) {
        printf("free delivery");
    }
    else {
        printf("invalid");
    }
    return 0;
}