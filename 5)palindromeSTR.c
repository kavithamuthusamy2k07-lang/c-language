#include<stdio.h>
int main(){
    char str[90];
    int len=0;
    int flag=1;
    fgets(str,sizeof(str),stdin);
     str[strcspn(str, "\n")] = '\0';
     for(int i=0;str[i]!='\0';i++)
    {  
        len++;
    }
    for(int i=0;i<len/2;i++){
        if(str[i]!=str[len-i-1]){
            flag=0;
            break;
        }
    }
    if(flag==1){
    printf("palindrome");
    }
    else{
    printf(" not palindrome");
}
    return 0;
}