#include<stdio.h>
int main(){
    int i=1;
    int sum=0;
    int max_weight;
    int total_mem;
    int per_mem_weight;
    int a=0;
    int passengers_allowed;
    scanf("%d",&max_weight);
    scanf("%d",&total_mem);
    while(i<=total_mem){
       scanf("%d",&per_mem_weight);
       sum=sum+per_mem_weight;
      
       i++;
    }
    if(sum>max_weight){
        a++;
       printf("overload:yes\n");
    }
    else{
        printf("ovderload:no\n");
    }
   
    passengers_allowed=total_mem-a;
    printf("passengers allowed:%d\n",passengers_allowed);
   
    return 0;
}