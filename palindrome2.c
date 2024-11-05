// without using library function
#include<stdio.h>
#include<string.h>
void main()
{
    char str[40];
    int i=0,l=0,flag=1;
    printf("enter any string = ");
    gets(str);
    while(str[i]!='\0')
    {
        i++;
    }
    l=i;
    for(i=0;i<l/2;i++)
    {
        if(str[i]!=str[l-i-1])
        {
            flag = 0;
            break;
        }
    }
    if(flag==1)
    printf("palindrome");
    else
    printf("not a palidrome");
}