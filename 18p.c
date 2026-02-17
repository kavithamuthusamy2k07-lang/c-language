#include<stdio.h>
int main(){

    for(int i=1;i<=5;i++){
        for(int j=i;j>0;j--){
            printf("%c ",'F'-j);
        
        }
    printf(" \n");
    }
}