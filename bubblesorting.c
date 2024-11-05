#include <stdio.h>
int main() {
    int a[20], i, n, j, temp;
    
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    printf("Enter the unsorted array:\n");
    for(i = 0; i < n; i++) {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &a[i]);
    }
    for(i = 0; i < n - 1; i++) {
        for(j = 0; j < n - i - 1; j++) {
            if(a[j] > a[j + 1]) {
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
    printf("The sorted array elements are: ");
    for(i = 0; i < n; i++) {
        printf("%d\t", a[i]);
    }
    return 0;
}