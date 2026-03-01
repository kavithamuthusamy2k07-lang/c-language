#include<stdio.h>
int fact(int num){
    int fact=1;
    for(int i=1;i<=num;i++){
        fact=fact*i;
    }
    return fact;
}
int main(){
    int num;
    scanf("%d",&num);
    int x=fact(num);
    printf("%d",x);
    return 0;

}