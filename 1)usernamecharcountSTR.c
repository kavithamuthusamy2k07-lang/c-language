#include<stdio.h>
#include<string.h>

int main(){
    char str[50];
    int length=0;
    fgets(str,sizeof(str),stdin);
    for(int i=0;str[i]!='\0';i++){
        if(str[i]=='\n'){
            continue;
        }
        
        length++;
    }
    printf("%d",length);
    return 0;
}