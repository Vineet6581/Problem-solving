#include <stdio.h>
int main()
{
  int i,j,k,m,n,p,q,a[20][20],b[20][20],mult[20][20];
  printf("Enter the number of rows and columns of 1st matrix : ");
  scanf("%d%d",&m,&n);
  printf("Enter the number of rows and columns of 2nd matrix : ");
  scanf("%d%d",&p,&q);
  if(n==p)
  {
    printf("Enter the elements of 1st matrix : \n");
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        scanf("%d",&a[i][j]);
      }
    }
    printf("Enter the elements of 2nd matrix : \n");
    for(i=0;i<p;i++)
    {
      for(j=0;j<q;j++)
      {
        scanf("%d",&b[i][j]);
      }
    }
    for(i=0;i<m;i++)
    {
      for(j=0;j<q;j++)
      {
        mult[i][j]=0;
        for(k=0;k<n;k++)
        {
          mult[i][j] += a[i][k]*b[k][j];
        }
      }
    }
    printf("The product of two matrix is : ");
    for(i=0;i<m;i++)
    {
      for(j=0;j<q;j++)
      {
        printf("%d\t",mult[i][j]);
      }
    }
      printf("\n");
  }
  else 
  {
    printf("The matrix multiplication is not possible ");
  }
  return 0;
}