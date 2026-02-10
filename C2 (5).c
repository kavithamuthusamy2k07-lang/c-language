#include<stdio.h>
int main() {
    char a;
    printf("enter the input:");
    scanf("%c",&a);
    switch (a) {
        case '1':
            printf("Admin");
            break;
        case '2':
            printf("User");
            break;
        case '3':
            printf("Guest");
            break;
        default:
            printf("invalid");
    }
    return 0;

    }