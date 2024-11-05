#include<stdio.h>
void bubblepointer(int *,int);
int main()
{
    int arr[10],n,i;
    printf("enter the number of elements = ");
    scanf("%d",&n);
    printf("enter the array elements = ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    bubblepointer(arr,n);
    for(i=0;i<n;i++)
    {
        printf("%d\t",arr[i]);
    }
    return 0;
}
void bubblepointer(int *p,int num)
{
    int i,j,t;
    for(i=0;i<=num-1;i++)
    {
        for(j=0;j<=num-1-i;j++)
        {
            if(*(p+j)>*(p+j+1))
            {
                t=*(p+j);
                *(p+j)=*(p+j+1);
                *(p+j+1)=t;
            }
        }
    }
}
