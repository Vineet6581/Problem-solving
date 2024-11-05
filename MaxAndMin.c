#include<stdio.h>
int main()
{
    int n,a[20],i,min,max;
    printf("enter the number of elements = ");
    scanf("%d",&n);
    printf("enter the elements of array: ");
    for(i=0;i<n;i++)
    {
        printf("\nElement%d = ",i+1);
        scanf("%d",&a[i]);
    }
    min=a[0];
    max=a[0];
    for(i=1;i<n;i++)
    {
        if(max<a[i])
        {
            max=a[i];
        }
        if(min>a[i])
        {
            min = a[i];
        }
    }
    printf("max value = %d and min value = %d",max,min);
    return 0;
}
