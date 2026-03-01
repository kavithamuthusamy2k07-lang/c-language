#include<stdio.h>
float area(int r){
    float area;
    area=3.14*r*r;
    return area;
}
int main(){
    int r;
    scanf("%d",&r);
    float x;
    x=area(r);
    printf("%.2f",x);
    return 0; 
}