#include<stdio.h>
int main() {
    int a;
    printf("enter your percentage :");
    scanf("%d",&a);
    if (a>0&&a<60) {
        printf("  not eligible");
    }
    else if (a<=100&&a>=80) {
        printf("eligible");
    }
    else {
        printf("invalid input");
    }
    return 0;
}