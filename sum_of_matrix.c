// sum of two matrices and store it in 3rd matrix 
#include <stdio.h>
int main()
{
    int a[10][10],b[10][10],c[10][10],row,col,i,j;
    printf("enter the number of rows and columns : ");
    scanf("%d %d",&row,&col);
    printf("enter the elements of 1st matrix: \n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    printf("enter the elements of 2nd matrix : \n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            scanf("%d",&b[i][j]);
        }
    }
    printf("the sum of the matrices is : \n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            c[i][j] = a[i][j] + b[i][j];
            printf("%d\t",c[i][j]);
        }
        printf("\n");
    }
    return 0;
}
