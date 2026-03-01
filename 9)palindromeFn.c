#include<stdio.h>
int palindrome(int num){
     int reverse=0;
      int temp;
      temp=num;
   for(;num!=0;num/=10){
    reverse=reverse*10+(num%10);
   }
    if(reverse==temp){
       printf("palindrome");
    }
    else{
        printf("not Palindrome");
    }
}


int main(){
    int num;
    scanf("%d",&num);
    int x;
    x=palindrome(num);
    printf(x);
    return 0;
}