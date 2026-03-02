#include<stdio.h>
int main(){
    char str[90];
    fgets(str,sizeof(str),stdin);
    for(int i=0;str[i]!='\0';i++){
        if(str[i]=='@'||str[i]=='\0'){
            break;
        }
        printf("%c",str[i]);
    }
    return 0;
}