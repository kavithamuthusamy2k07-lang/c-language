
#include<stdio.h>
int main() {
    int a;
    printf("ac mode:");
    scanf("%d",&a);
    if (a<=18&&a>=0) {
        printf("heating mode");

    }
    else if (a>18&&a<=25 ){
        printf("normal mode");
    }
    else if (a>=35){
        printf("cooling mode");
    }
    else {
        printf("invalid");
    }
    return 0;
}