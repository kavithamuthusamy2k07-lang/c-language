#include<stdio.h>
#include<limits.h>

int main(){

    int row;
    int first_highest=INT_MIN;
    int second_highest=INT_MIN;
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
       for(int j=0;j<column;j++){
            if(arr[i][j]>first_highest){
                second_highest=first_highest;
                first_highest=arr[i][j];
            }
              else if(arr[i][j]>second_highest&&arr[i][j]!=first_highest){
            second_highest=arr[i][j];
        }
       
    }
}
 printf("highest salary:%d\n",first_highest);
 printf("second:%d\n",second_highest);
  return 0;
}
