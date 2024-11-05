#include<stdio.h>
#include<math.h>
void main(){
    int n,num,digit,rev=0,p=0;
    float sum=0;
    printf("enter any number = ");
    scanf("%d",&n);
    num=n;
    while(n!=0)
    {
        digit = n%10;
        rev=rev*10+digit;
        p++;
        n=n/10;
    }
    n=num;
    while(n!=0)
    {
        digit=n%10;
        sum+=pow(digit,p);
        n=n/10;
    }
    if(rev == num)
    printf("number is a palindrome");
    else
    printf("\nnumber is not palindrome");
    if(num==(int)sum)
    printf("\nArmstrong");
    else
    printf("\nnot an armstrong");
}