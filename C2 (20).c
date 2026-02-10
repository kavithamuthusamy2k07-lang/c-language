#include<stdio.h>
int main() {
    int age;
    printf("enter your age :");
    scanf("%d",&age);
    if (age>=18&&age<=70) {
        printf("eligible");
    }
    else if (age>1&&age<18) {
        printf("not eligible");
    }
    else {
        printf("invalid input");
    }
    return 0;