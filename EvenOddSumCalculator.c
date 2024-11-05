#include<stdio.h>
int main()
{
    int n,i,a[20],b=0,c=0;
    printf("enter n = ");
    scanf("%d",&n);
    printf("enter the array elements \n");
    for(i=0;i<n;i++)
    {
        printf("enter the elements %d= ",i+1);
        scanf("%d",&a[i]);
    }
    printf("the even places are : ");
    for(i=0;i<n;i+=2)
    {
        b += a[i];
        printf("%d ",a[i]);
    }
    printf("\nthe odd places are : ");
    for(i=1;i<n;i+=2)
    {
         c += a[i];
        printf("%d ",a[i]);
       
    }
    printf("\nsum of even = %d",b);
    printf("\nsum of odd = %d",c);
    return 0;
}