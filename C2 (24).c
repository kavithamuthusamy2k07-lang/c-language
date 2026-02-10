#include<stdio.h>
int main() {
    int a,b;
    printf("enter your mark and income :");
    scanf("%d%d",&a,&b);
    if (a>=85&&b<3,00,000) {
        printf(" eligible");
    }
    else if ((a<85&&b<=3,00,000)||(a>=85&&b>300000)) {
        printf("not eligible");
    }
    else {
        printf("invalid input");
    }
    return 0;
}