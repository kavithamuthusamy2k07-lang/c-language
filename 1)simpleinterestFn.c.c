#include<stdio.h>
float simpleInterest(int p,int r,int t){
   float  SI;
   SI=(p*r*t)/100;
   return SI;
}
int main(){
    int p,r,t;
    scanf("%d%d%d",&p,&r,&t);
    float SI=simpleInterest(p,r,t);
    printf("%.2f",SI);
    return 0;
}