#include<stdio.h>
int main(){
    int capacity;
    scanf("%d",&capacity);
    int total_hrs;
    scanf("%d",&total_hrs);
    int process;
    int sum=0;
    int count=0;
    int i=1;
    while(i<=total_hrs){
        scanf("%d",&process);
        sum=sum+process;
         if(sum>(0.9)*capacity){
        count++;
    }
        i++;
    }
    
    printf("final occupies:%d\n",sum);
    printf("critical hours:%d\n",count);
    return 0;
}