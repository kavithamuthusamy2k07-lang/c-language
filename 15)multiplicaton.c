#include<stdio.h>
int multiplication(int n){
    int product;
   for(int i=1;i<=10;i++){
    product=n*i;
    printf("%d*%d=%d\n",n,i,product);
   }
}
int main(){
   int N;
   scanf("%d",&N);
   int x;
   for(int i=1;i<=N;i++){
   x=multiplication(N);
   printf(x);
   }
   return 0;
}
