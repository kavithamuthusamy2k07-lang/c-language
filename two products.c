#include <stdio.h>

// Function to find two products matching target sum
void findTwoProducts(int arr[], int n, int target) {
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] + arr[j] == target) {
                printf("%d %d\n", arr[i], arr[j]);
                return; // Only first valid pair needed
            }
        }
    }
    printf("No pair\n");
}

int main() {
    int n, target;
    printf("Enter number of products: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter product prices: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter target sum: ");
    scanf("%d", &target);

    findTwoProducts(arr, n, target);

    return 0;
}