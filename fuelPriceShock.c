#include<stdio.h>
int main(){
    int Hprice_days;
    int Hfuel_price;
    int highest=0,count=0;
    scanf("%d",&Hprice_days);
    for(int i=0;i<Hprice_days;i++){
        scanf("%d",&Hfuel_price);
    if(i==0||Hfuel_price>highest){
        highest=Hfuel_price;
    }
        if(Hfuel_price>=100){
            count++;
     }
    }
    printf("\n%d",highest);
    printf("\nHigh price Days:%d",count);
    return 0;
}