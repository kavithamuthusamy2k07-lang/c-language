#include<stdio.h>
int main() {
    float GB_used;
    printf("enter the GB used:");
    scanf("%f",&GB_used);
    if (GB_used>2) {
        printf("data limit exceeded");

    }
    else if (GB_used<2&&GB_used>0){
        printf("data within limit");
    }
    else {
        printf("invaliid input");
    }
    return 0;
}