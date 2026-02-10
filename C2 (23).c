#include<stdio.h>
int main() {
    int a;
    printf("enter your amoount ");
    scanf("%d",&a);
    if (a<500) {
        printf("not suffient");
    }
    else if (a>500) {
        printf("sufficient");
    }
    else {
        printf("invalid input");
    }
    return 0;
}