#include<stdio.h>
int main() {
    int speed;
    printf("enter the speed;");
    scanf("%d",&speed);
    if (speed>80) {
        printf("speed limit exceeded:fine");
    }

    else if (speed<=80&&speed>0) {
        printf("speed within limiit:no fine");
    }
   else {
       printf("invalid input");

   }
    return 0;
}