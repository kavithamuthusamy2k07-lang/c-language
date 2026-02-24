#include <stdio.h>

// Function to find equilibrium index (Expense Balance Point)
int findEquilibriumIndex(int arr[], int n) {
    int totalSum = 0, leftSum = 0;
    for (int i = 0; i < n; i++) {
        totalSum += arr[i];
    }
    for (int i = 0; i < n; i++) {
        // Right sum = totalSum - leftSum - current element
        if (leftSum == totalSum - leftSum - arr[i]) {
            return i;
        }
        leftSum += arr[i];
    }
    return -1;
}

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
    int choice;
    printf("Choose problem:\n1. Expense Balance Point\n2. Two Products Matching Bill\n");
    scanf("%d", &choice);

    if (choice == 1) {
        int n;
        printf("Enter number of expenses: ");
        scanf("%d", &n);
        int arr[n];
        printf("Enter expenses: ");
        for (int i = 0; i < n; i++) scanf("%d", &arr[i]);

        int index = findEquilibriumIndex(arr, n);
        printf("Equilibrium Index: %d\n", index);

    } else if (choice == 2) {
        int n, target;
        printf("Enter number of products: ");
        scanf("%d", &n);
        int arr[n];
        printf("Enter product prices: ");
        for (int i = 0; i < n; i++) scanf("%d", &arr[i]);

        printf("Enter target sum: ");
        scanf("%d", &target);

        findTwoProducts(arr, n, target);
    } else {
        printf("Invalid choice!\n");
    }

    return 0;
}