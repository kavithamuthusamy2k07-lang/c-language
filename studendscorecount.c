#include<stdio.h>
int main() {
 int  size;
 scanf("%d",&size);
 int arr[size];
 int count=0;

 for (int i=0;i<size;i++) {
  scanf("%d",&arr[i]);
 }
 int x;
 scanf("%d",&x);
 for (int i=0;i<size;i++) {
  if (arr[i]==x){
   count++;
  }
 }
  printf("%d",count);
  return 0;
 }