#include<stdio.h>
int sumdigit(int num){
    int sum=0,x;
    while(num!=0){
        x=num%10;
        sum=sum+x;
        num/=10;
    }
    return sum;
}
int main(){
    int N;
    scanf("%d",&N);
    int sum;
    sum=sumdigit(N);
    printf("%d",sum);
    return 0;
}