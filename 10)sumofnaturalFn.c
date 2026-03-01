#include<stdio.h>
int sumofNatural(int N){
int sum=0;
for(int i=1;i<=N;i++){
    sum=sum+i;
}
return sum;
}
int main(){
    int N;
    scanf("%d",&N);
    int x;
    x=sumofNatural(N);
    printf("%d",x);
    return 0;
}