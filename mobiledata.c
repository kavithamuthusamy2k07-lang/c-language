#include<stdio.h>
int main( ) {
    int data_pack;
    scanf("%d",&data_pack);
    int N;
    scanf("%d",&N);
    int usage;
    int i=0;
    int exhausted_day=0;
    int over_usedData=0;
    while (i<N) {
        scanf("%d",&usage);
        data_pack=data_pack-usage;
        if (data_pack<=0) {
            exhausted_day=i+1;
            over_usedData=-data_pack;
            break;
        }
        i++;
    }
    printf("exhausted_day:%d\n",exhausted_day);
    printf("over_used_data:%d\n",over_usedData);
    return 0;
}