// copying the content of file 2 into file 1.
#include<stdio.h>
#include<stdlib.h>
int main()
{
    FILE *ptr1,*ptr2;
    char ch;
    ptr1=fopen("file1.txt","w");
    ptr2=fopen("file2.txt","r");
    while((ch=fgetc(ptr2))!=EOF)
    {
        fputc(ch,ptr1);
    }
    fclose(ptr1);
    fclose(ptr2);
    ptr1 = fopen("file1.txt","r");
    while((ch=fgetc(ptr1))!=EOF)
    {
        printf("%c",ch);
    }
    return 0;
}