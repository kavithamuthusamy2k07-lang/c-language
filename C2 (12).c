#include<stdio.h>
int main() {
 int    purchase_amount;
 printf("enter the amount purchased:");
 scanf("%d",&purchase_amount);
 if (purchase_amount>=1000) {
  printf("discount is applied");
 }
 else {
  printf("discount is not appplied");
 }
 return 0;
}