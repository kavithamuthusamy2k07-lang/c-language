#include<stdio.h>
int main() {
    int length;
    printf("enter the length of the password");
    scanf("%d",&length);
    if (length>=8) {
        printf("strongg password");
    }
    else {
        printf("weak password");
    }
    return 0;
}