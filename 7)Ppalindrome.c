#include<stdio.h>
int main(){
char str[90];
fgets(str,sizeof(str),stdin);
char *start=str;
char *end=str;
int flag=1;
while(start<end){
    if(*start!=*end){
        flag=0;
        break;
    }
    start++;
    end--;

}
if(flag==1){
printf("yes");
}
else{
    printf("no");
}
return 0;
}