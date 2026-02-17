#include <stdio.h>

int main() {
    int i, j;

    // Upper part (including middle line)
    for(i = 1; i <= 5; i++) {
        
        // Left stars
        for(j = 1; j <= i; j++) {
            printf("*");
        }

        // Spaces
        for(j = 1; j <= 10 - 2*i; j++) {
            printf(" ");
        }

        // Right stars
        for(j = 1; j <= i; j++) {
            printf("*");
        }

        printf("\n");
    }

    // Lower part
    for(i = 4; i >= 1; i--) {
        
        // Left stars
        for(j = 1; j <= i; j++) {
            printf("*");
        }

        // Spaces
        for(j = 1; j <= 10 - 2*i; j++) {
            printf(" ");
        }

        // Right stars
        for(j = 1; j <= i; j++) {
            printf("*");
        }

        printf("\n");
    }

    return 0;
}
