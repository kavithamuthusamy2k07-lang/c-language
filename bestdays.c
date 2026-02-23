#include <stdio.h>

void findLeaders(int arr[], int n) {
    int max_from_right = arr[n-1];

    // Last element is always a leader
    printf("%d ", max_from_right);

    // Traverse from second last to first
    for (int i = n-2; i >= 0; i--) {
        if (arr[i] >= max_from_right) {
            max_from_right = arr[i];
            printf("%d ", arr[i]);
        }
    }
    printf("\n");
}

int main() {
    int n;

    // Input size
    printf("Enter number of days: ");
    scanf("%d", &n);

    int arr[n];

    // Input performance array
    printf("Enter performance values: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Leader values: ");
    findLeaders(arr, n);

    return 0;
}