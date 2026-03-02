#include<stdio.h>
int main(){
    char str[100];
    int i=0;
    int flag=0;
    fgets(str,sizeof(str),stdin);
    while(str[i]!='\0'){
        if(str[i]>=65&&str[i]<=90){
           flag=1;
           break;
        }
        i++;
    }
    if(flag==1)
      printf("valid");
    
     else
       printf("invalid");
     
return 0;
}