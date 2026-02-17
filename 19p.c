#include<stdio.h>
int main(){
int i,j,n;
scanf("%d",&n);
for(i=0;i<=n;i++){
    for(j=-n;j<=n;j++){
        if(j>-(i)&&j<(i)){
            printf(" ");
        }
        else{
            printf("*");
        }
    }
    printf("\n");
   }  

 for(int k=0;k<=n;k++){
    for(int j=-n;j<=n;j++){
        if(j>-(n-k)&&j<(n-k)){
            printf(" ");
        }
        else
        {
            printf("*");
        }
    }
    printf("\n");
   }  
}
