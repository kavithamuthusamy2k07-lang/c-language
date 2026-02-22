#include<stdio.h>
int main() {
    int N;
    scanf("%d",&N);
    int arr[N];
    int even=0;
    int odd=0;
    for (int i=0;i<N;i++) {
        scanf("%d",&arr[i]);
        if (arr[i]%2==0) {
            even++;
        }
        else {
            odd++;
        }
    }
    printf("even:%d\n",even);
    printf("odd:%d",odd);
    return 0;
}