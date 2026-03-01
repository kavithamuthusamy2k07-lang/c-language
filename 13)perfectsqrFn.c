#include<stdio.h>
int isperfectsqr(int num){
    int sum=0;
    for(int i=1;i<=num/2;i++){
        if(num%i==0){
            sum=sum+i;
        }
    }
    if(sum==num){
        return 1;
    }
    else{
        return 0;
    }

}
int main()
{
    int num;
    scanf("%d",&num);
    if(isperfectsqr(num))
    {
        printf("perfect num");
    }
    else
    {
        printf("not perfect num");
    }
    return 0;
}