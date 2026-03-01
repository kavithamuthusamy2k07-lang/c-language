#include<stdio.h>
int leap(int n){
    if(n%4==0&&n%100!=0||n%400==0){
        printf("leap year");
    }
    else{
        printf("not an leap year");
    }

}  
int main(){
    int year;
    scanf("%d",&year);
    int x;
    x=leap(year);
    printf(x);
    return 0;
}