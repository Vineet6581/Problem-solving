#include <stdio.h>
int main()
{
    int a[20],i,j,n,temp;
    printf("enter the number of elements ");
    scanf("%d",&n);
    printf("enter the elements of unsorted array\n");
    for(i=0;i<n;i++)
    {
        printf("enter the elements = %d ",i+1);
        scanf("%d",&a[i]);
    }
    for(i=1;i<n;i++)
    {
        temp=a[i];
        j=i-1;
        while(j>=0 && a[j]>temp)
        {
            a[j+1] = a[j];
            j--;
        }
        a[j+1] = temp;
    }
    printf("the sorted array elements are : ");
    for(i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
    return 0;
}