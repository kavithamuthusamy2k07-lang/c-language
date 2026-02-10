
#include<stdio.h>
int main() {
    int a;
    printf("mark:");
    scanf("%d",&a);
    if (a<=35&&a>=0) {
        printf("fail");

    }
    else if (a>35&&a<=55) {
        printf("pass");
    }
    else if (a>=85&&a<=100){
        printf("distinction");
    }
    else {
        printf("invalid");
    }
        return 0;
}