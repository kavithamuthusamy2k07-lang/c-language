#include<stdio.h>
int main()
{  
  int roomType;
  int charSea;
  int A,B,C,D;
  printf("enter the type:");
  
  scanf("%d",&roomType);
  printf("enter the charsea:");
  
  scanf("%d",&charSea);
  switch(roomType)
  { 
    case (1):
    {
        
        if(charSea==A)
        {
            printf("$2500");
            break;
        }
        else if(charSea==B)
        {
            printf("$2000");
        }
        break;
    }
    case (2):
    {
        
        if(charSea==C)
        {
            printf("$4000");
            break;
        }
        else if(charSea==D)
        {
            printf("$4500");
        }
        break;
    }
    return 0;
}
}