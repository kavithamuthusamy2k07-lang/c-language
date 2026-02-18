#include<Stdio.h>
int main(){
    int i=1,num_days;
    int transaction;
    int initial_amt;
    int sum=0;
    int count=0;
    int final_balance;
    scanf("%d",&num_days);
    
    while(i<=num_days){
        scanf("%d",&transaction);
        sum=sum+transaction;
        if(transaction>0&&transaction<2000){
        count++;
      }
        i++;
      }
      printf("\nsum:%d",sum);
      
      
      printf("\nenter the initial values:");
     
       scanf("%d",&initial_amt);
      final_balance=initial_amt+sum;
      
      
      
    printf("\nfinal:%d",final_balance);
    printf("\nlow balance days:%d",count);
    return 0;
  

  }

     
  
  

