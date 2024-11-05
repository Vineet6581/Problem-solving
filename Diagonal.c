#include<stdio.h>
int main(){
    int a[20][20], row, col, i, j, sum = 0;
    scanf("%d", &row);
    scanf("%d", &col);
    for(i = 0; i < row; i++){
        for(j = 0; j < col; j++){
            scanf("%d", &a[i][j]);
        }
    }   
    for(i = 0; i < row && i < col; i++){
        sum += a[i][i];
    }
    printf("Sum of principal diagonal: %d\n", sum);
    return 0;
}
