#include <stdio.h>
int main()
{
    int i,n,sum=0;
    printf ("enter the number");
    scanf("%d",&n);
    i=1;
   while(i<=n)
   {
    sum=sum+i;
    i++;
   }
   printf("the sum is %d",sum);

    return 0;
}