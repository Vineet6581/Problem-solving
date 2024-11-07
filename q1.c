#include <stdio.h>
int main() {
    int n, i, j, temp;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    int arr[n], even_numbers[n], odd_numbers[n];
    int even_count = 0, odd_count = 0;
    for (i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
    for (i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
            even_numbers[even_count++] = arr[i];
        } else {
            odd_numbers[odd_count++] = arr[i];
        }
    }
    for (i = 0; i < even_count - 1; i++) {
        for (j = i + 1; j < even_count; j++) {
            if (even_numbers[i] < even_numbers[j]) {
                temp = even_numbers[i];
                even_numbers[i] = even_numbers[j];
                even_numbers[j] = temp;
            }
        }
    }
    for (i = 0; i < odd_count - 1; i++) {
        for (j = i + 1; j < odd_count; j++) {
            if (odd_numbers[i] > odd_numbers[j]) {
                temp = odd_numbers[i];
                odd_numbers[i] = odd_numbers[j];
                odd_numbers[j] = temp;
            }
        }
    }
    printf("Even numbers in descending order: ");
    for (i = 0; i < even_count; i++) {
        printf("%d ", even_numbers[i]);
    }
    printf("\n");
    printf("Odd numbers in ascending order: ");
    for (i = 0; i < odd_count; i++) {
        printf("%d ", odd_numbers[i]);
    }
    printf("\n");
    return 0;
}
