#include<stdio.h>
void max(int *a, int *b){
    if(*a>*b){
        return 1;
    }
    else{
        return 0;
    }
}
int main(){
    int a,b;
    scanf("%d%d",&a,&b);
    int h=max(&a,&b);
    if(h==1){
        printf("%d",a);
    }
    else{
        printf("%d",b);
    }
    return  0;
}