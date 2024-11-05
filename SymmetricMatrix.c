#include <stdio.h>
int main() {
int i, j, row, col,a[20][20],flag=1;
printf("Enter the number of rows and columns: ");
scanf("%d%d", &row, &col);
if (row != col) {
    printf("Matrix is not square, hence it cannot be symmetric.\n");
        return 0;
    }
else
{
    printf("Enter the elements of the matrix:\n");
        for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
             scanf("%d", &a[i][j]);
                 }
             }
        for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            if (a[i][j] != a[j][i]) {
            flag = 0;
            break;
            }
        }
if (flag==0) {
    break;
    }
    }
    }
    if (flag==1) 
        printf("The matrix is symmetric.\n");
    else 
        printf("The matrix is not symmetric.\n");

    return 0;
}
