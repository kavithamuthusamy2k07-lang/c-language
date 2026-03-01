#include<stdio.h>
int reverseNum(int num){
   int reverse=0;
   for(;num!=0;num/=10){
    reverse=reverse*10+(num%10);
   }
   return reverse;
}
int main(){
  int N;
  scanf("%d",&N);
  int  reverse;
  reverse=reverseNum(N);
  printf("%d",reverse);
  return 0;
}
