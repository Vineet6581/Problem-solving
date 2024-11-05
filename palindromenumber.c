#include <stdio.h>
int main()
{
    int n,digit,rev=0,original_n;
    printf("enter any number :");
    scanf("%d",&n);
    original_n=n;
    while(n!=0)
    {
           digit=n%10;
        rev=rev*10+digit;
      n=n/10;
    }
    if(original_n==rev)
    {
        printf("%d is the palindrome",original_n);
    }
    else 
    {
        printf("%d is not a palindrome number",original_n);
    }
}