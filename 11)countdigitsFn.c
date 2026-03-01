#include<stdio.h>
int count(int a){
    int count=0;
for(;a!=0;a/=10){
        count++;
    }
    return count;
}
int main(){
    int n;
    scanf("%d",&n);
    int x;
    x=count(n);
    printf("%d",x);
    return 0;
}