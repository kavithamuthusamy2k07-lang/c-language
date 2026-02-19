#include<stdio.h>
int main(){
    int total_orders;
    scanf("%d",&total_orders);
    int num_orders;
    int i=1;
    
    int successfull=0;
    int cancelled=0;
   
    while(i<=total_orders){
    scanf("%d",&num_orders);
    if(num_orders==1){
       successfull++;
    }
    else 
    {
        cancelled++;
        
    }
     i++;
}
       
printf("successfull:%d\n",successfull);
printf("cancelled:%d\n",cancelled);
 if(cancelled>3){
            printf("order status:risk\n");
        }
        else{
          printf("order status:safe\n");
        }
    
   

return 0;
}