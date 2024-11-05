#include <stdio.h>
int main()
{
    int i,j,row,col;
    printf("enter the number of rows and columns : ");
    scanf("%d%d",&row,&col);
    int a[row][col],b[row][col];
    printf("enter the elements of matrix : \n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
             b[j][i] = a[i][j];
        }
    }
    printf("the transpose of the matrix is : \n");
    for(i=0;i<col;i++)
    {
        for(j=0;j<row;j++)
        {
           
            printf("%d\t",b[i][j]);
        }
        printf("\n");
    }
    return 0;
}
