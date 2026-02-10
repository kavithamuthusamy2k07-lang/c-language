#include <stdio.h>

int main() {
    int planType;
    int paymentMode;
    int amount = 0, cashback = 0;

    // Input
    scanf("%d", &planType);
    scanf("%d", &paymentMode);

    // Outer switch for plan
    switch (planType) {
        case 1:
            amount = 199;
            break;

        case 2:
            amount = 399;
            break;

        default:
            printf("Invalid Plan");
            return 0;
    }

    // Inner switch for payment mode
    switch (paymentMode) {
        case 11:   // UPI
        case 12:   // Card
            cashback = 20;
            break;

        case 13:   // Wallet
            cashback = 0;
            break;

        default:
            printf("Invalid Payment Mode");
            return 0;
    }

    // Final amount
    printf("Pay ₹%d", amount - cashback);

    return 0;
}