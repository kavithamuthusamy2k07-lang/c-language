#include<stdio.h>
int evenodd(int a){
    if(a%2==0){
        printf("even");
    }
    if(a==0){
        printf("neither even nor odd");
    }
    else{
        printf("odd");
    }

}
int main(){
    int a;
    scanf("%d",&a);
    int x;
    x=evenodd(a);
    printf(x);
    return 0;
}