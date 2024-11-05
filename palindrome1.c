// using library functions
#include<stdio.h>
#include<string.h>
void main()
{
    char s1[20],s2[20];
    printf("enter the element = ");
    gets(s1);
    strcpy(s2,s1);
    strrev(s1);
    if(strcmp(s1,s2)==0)
    printf("palindrome");
    else 
    printf("not a palindrome");
}
