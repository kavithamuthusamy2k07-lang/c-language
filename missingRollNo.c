#include<stdio.h>
int main() {
    int size;
    scanf("%d",&size);
    int arr[size];
    int sum1=0;
    int sum2=0;

    for (int i=0;i<=size;i++) {
        sum1+=i;
    }

    printf("enter the num\n");
    for (int i=0;i<size-1;i++){
        scanf("%d",&arr[i]);
        sum2+=arr[i];
    }
    printf("Missing_roll_num:%d",sum1-sum2);
    return 0;
}

