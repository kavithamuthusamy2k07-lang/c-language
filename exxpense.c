#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int arr[n];
    int total_sum = 0;

    // Read array and calculate total sum
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        total_sum += arr[i];
    }

    int left_sum = 0;

    // Find equilibrium index
    for(int i = 0; i < n; i++) {
        int right_sum = total_sum - left_sum - arr[i];

        if(left_sum == right_sum) {
            printf("%d\n", i);
            return 0;
        }

        left_sum += arr[i];
    }

    // If no equilibrium index found
    printf("-1\n");

    return 0;
}