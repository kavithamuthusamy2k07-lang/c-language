#include<stdio.h>
#include<string.h>
int main(){
    char str[90];
    int count=0;
    fgets(str,sizeof(str),stdin);
    str[strcspn(str,"\n")]= '\0';
    for(int i=0;str[i]!='\0';i++){
        if((str[i]>=65&&str[i]<=90)||(str[i]>=97&&str[i]<=122)||(str[i]>=48&&str[i]<=57)){
            continue;
        }
        count++;
    }
printf("%d",count);
return 0;
}
