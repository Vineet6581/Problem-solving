// for the matrix to be symmetric it's transpose should be equal to the matrix itself. 
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int i,j,row,col,count=0;
    printf("enter the number of rows and columns : ");
    scanf("%d%d",&row,&col);
    if(row!=col)
    {
        printf("the matrix is not symmetric");
        exit(0);
    }
    else 
    {
        int a[row][col],b[row][col];
        printf("enter the elements of 1st matrix : \n");
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
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(a[i][j]!=b[i][j])
                {
                    count++;
                }
            }
        }
        if(count==0)
        {
            printf("matrix is symmetrical");
        }
        else{
            printf("matrix is not symmetrical");
        }
    }
}