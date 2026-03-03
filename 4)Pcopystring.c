#include<stdio.h>
int main(){
    char src[90],dest[90];
    fgets(src,sizeof(src),stdin);
    char *p1=src;
    char *p2=dest;
    while(*p1!='\0'){
        *p2=*p1;
         p1++;
         p2++;

    }
       *p2='\0';
    printf("%s",dest);
  
    return 0;

}