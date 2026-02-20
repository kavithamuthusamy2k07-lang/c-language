#include<stdio.h>
int main() {
    int ATMcash;
    scanf("%d",&ATMcash);
    int N;
    scanf("%d",&N);
    int withdraw_amt;
    int sum=0;
    int i=1;
    int count=0;
    int remaining_amt=0;
    while (i<=N) {
        scanf("%d",&withdraw_amt);
        sum+=withdraw_amt;
        if (sum<=ATMcash) {
            count++;
        }
        i++;
    }
    remaining_amt=sum-ATMcash;
    printf("successfull withdraw:%d\n",count);
    printf("remaining cash=%d",remaining_amt);
    return 0;
}