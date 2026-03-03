#include<stdio.h>
int main()
{
char src[90];
fgets(src,sizeof(src),stdin);
char dest[90];
fgets(dest,sizeof(dest),stdin);
char *p1=src;
char *p2=dest;

while(*p1!='\0'&&*p1!='\n'){
    p1++;
}
while(*p2!='\0'){
    if(*p2!='\n'){
        *p1=*p2;
        p1++;
    }
    p2++;

}
*p1='\0';
printf("%s",src);
return 0;
}