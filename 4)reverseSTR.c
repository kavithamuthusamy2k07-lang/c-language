#include<stdio.h>
int main(){
    char str[90];
    int len=0;
    fgets(str,sizeof(str),stdin);
    for(int i=0;str[i]!='\0';i++){
        len++;
    }
    for(int i=len-1;i>=0;i--){
        printf("%c",str[i]);
    }
   
    return 0;
}