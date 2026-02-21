#include<stdio.h>
int main() {
    int size;
    scanf("%d",&size);
    int arr[size];
    printf("enter the route\n");
    for (int i=0;i<size;i++) {
        scanf("%d",&arr[i]);
    }
    int start=0,end=size-1,temp;
    while (start<end) {
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    for (int i=0;i<size;i++) {
        printf("%d " ,arr[i]);
    }

    return 0;

}