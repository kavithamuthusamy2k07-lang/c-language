#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int *p=arr;
    int x;
    scanf("%d",&x);
    int i=0;
    for(int i=0;i<n;i++){
        if(*(p+i)==x){
            printf("%d",i);
            break;
        }
       
    }
      printf("-1");
        
    return 0;
}