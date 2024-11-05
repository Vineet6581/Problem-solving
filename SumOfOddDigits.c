#include <stdio.h>
int main()
{
    int n;
    printf("enter any number = ");
    scanf("%d",&n);
    int digit = 0, sum=0;
    while(n!=0)
    {
        digit = n%10;
        if(digit%2!=0)
        {
            sum = sum + digit;
        }
        n = n/10;
    }
      printf("sum = %d",sum);
      return 0;
}
