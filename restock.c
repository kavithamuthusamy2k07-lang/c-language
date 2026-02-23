#include <stdio.h>

void replaceWithFutureMax(int arr[], int n) {
int max_from_right = -1;  // Last element has no future, so -1

// Traverse from right to left
for (int i = n - 1; i >= 0; i--) {
int temp = arr[i];        // Store current value
arr[i] = max_from_right;  // Replace with max seen so far
if (temp > max_from_right) {
max_from_right = temp; // Update max if needed
}
}
}

int main() {
int n;

// Input size
printf("Enter number of days: ");
scanf("%d", &n);

int arr[n];

// Input stock prices
printf("Enter stock prices: ");
for (int i = 0; i < n; i++) {
scanf("%d", &arr[i]);
}

// Perform replacement
replaceWithFutureMax(arr, n);

// Output modified array
printf("Modified array: ");
for (int i = 0; i < n; i++) {
printf("%d ", arr[i]);
}
printf("\n");

return 0;
}