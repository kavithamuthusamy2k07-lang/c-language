#include<stdio.h>
int main() {
    int age;
    printf("enter your age :");
    scanf("%d",&age);
    if (age>0&&age<12) {
        printf("discount ticket");
    }
    else if (age>=12) {
        printf("regular ticket");
    }
    else {
        printf("invalid input");
    }
    return 0;
}