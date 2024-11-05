#include <stdio.h>
int main()
{
    int a[20],n,i,j,val,pos;
    printf("enter the number of elements ");
    scanf("%d",&n);
    printf("enter the element of array\n ");
    for(i=0;i<n;i++)
    {
        printf("enter the element number %d = ",i+1);
        scanf("%d",&a[i]);
    }
    printf("enter the position :");
    scanf("%d",&pos);
    printf("enter the value");
    scanf("%d",&val);
    for(j=n-1;j>=pos-1;j--)
    {
        a[j+1]=a[j];
    }
    a[pos-1]=val;
    printf("the value in array after insertion :");
    for(i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
    return 0;
}
