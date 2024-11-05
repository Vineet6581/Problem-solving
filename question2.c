// write a program to print all the ASCII values and their equivalent characters of 26 alphabets using a while loop.
// CAPITAL CASE
#include <stdio.h>
int main()
{
    for(int i=65;i<=90;i++)
    {
        printf("%c = %d\n",(char)i,i);
    }
    
    return 0;
    
}