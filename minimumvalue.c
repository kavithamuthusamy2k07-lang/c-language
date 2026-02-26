#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int price;
    int min_price = 0;
    int found = 0;  // flag to check if any positive number exists

    for(int i = 0; i < n; i++) {
        scanf("%d", &price);

        if(price > 0) {
            if(found == 0 || price < min_price) {
                min_price = price;
                found = 1;
            }
        }
    }

    if(found)
        printf("%d", min_price);
    else
        printf("No positive");

    return 0;
}