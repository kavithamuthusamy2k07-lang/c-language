#include<stdio.h>
int maxnum(int a,int b){
   if(a>b){
    return a;
   }
   else{
    return b;
   }
}
int main(){
    int a,b;
    scanf("%d%d",&a,&b);
    int x;
    x=maxnum(a,b);
    printf("maximum number:%d",x);
    return 0;

}