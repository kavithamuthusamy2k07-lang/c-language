#include<stdio.h>
int main() {
    int a;
    printf("enter the number :");
    scanf("%d",&a);
    if (a<0) {
        printf("negative");;
    }
    else if(a>0) {
        printf("positive");

    }
    else {
        printf("neutral");

    }
    return 0;
}

