#include<stdio.h>
int main() {
    int a;
    printf("enter the length of the character:");
    scanf("%d",&a);
    if (a>=5) {
        printf("valid email");
    }
    else if (a>0&&a<5) {
        printf("invalid email");
    }
    else {
        printf("invalid");
    }
    return 0;
}