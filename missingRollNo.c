#include<stdio.h>
int main() {
    int N;
    printf("enter N:\n");
    scanf("%d",&N);//N=Total num of students
    int arr[N];
    int sum1=0;
    int sum2=0;
    printf("enter i\n");
        for (int i=1;i<N;i++) {
            scanf("%d",i);
            sum1=sum1+i;//roll num of per student
        }
        printf("enter N");

        scanf("%d",&N);
        for (int i=0;i<N-1;i++) {
            scanf("%d",&arr[i]);
            sum2=sum2+arr[i];
        }

    int missing_roll_num;
    missing_roll_num=sum1-sum2;
    printf("%d",missing_roll_num);
    return 0;
}