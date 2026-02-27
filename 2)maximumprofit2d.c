#include<stdio.h>
#include<limits.h>

int main(){
    int row;
     int max=INT_MIN;
     int product;
    scanf("%d",&row);
    int column;
    scanf("%d",&column);
    int arr[row][column];
    for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    for(int i=0;i<row;i++){
      for(int j=i+1;j<row;j++){
        for(int k=0;k<column;k++){
            for(int l=0;l<column;l++){
                product=arr[i][k]*arr[j][l];
                  if(product>max){
                    max=product;
                  }  
                }
            }
          }
        }
         printf("%d",max);
     return 0;
    }
    
    
