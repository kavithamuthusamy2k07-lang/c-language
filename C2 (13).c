#include<stdio.h>
int main() {
    int temp;
    printf("entrer the temp:");
    scanf("%d",&temp);
    if (temp<=20) {
        printf("temp status:cold");
    }
    else if (temp>=20&&temp<=30) {
        printf("temp status:normal");

    }
    else if (temp>=30) {
        printf("temp status:hot");
    }
    return 0;
}