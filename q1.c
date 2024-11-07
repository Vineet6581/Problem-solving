#include <stdio.h>
int main() {
    int n;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    
    int arr[n];
    for (int i = 0; i < n; i++) {
        printf("enter the element %d: ",i+1);
        scanf("%d",&arr[i]);
    }
    int Count = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
            int temp = arr[Count];
            arr[Count] = arr[i];
            arr[i] = temp;
            Count++;
        }
    }
    for (int i = 0; i < Count - 1; i++) {
        for (int j = i + 1; j <Count; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    for (int i = Count; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    printf("Sorted array with even numbers first and odd numbers later: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}
