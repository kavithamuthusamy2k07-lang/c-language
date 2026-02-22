#include<stdio.h>
int main() {
    int sorted=1;
    int size;
    scanf("%d",&size);
    int arr[size];
    for (int i=0; i<size-1;i++) {
        scanf("%d",&arr[i]);
        if (arr[i]>arr[i+1]) {
            sorted=0;
            break;
        }
    }
    if (sorted) {
        printf("yes");
    }
    else {
        printf("no");
    }
    return 0;
}