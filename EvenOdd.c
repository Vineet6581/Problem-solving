#include<stdio.h>
#include<stdlib.h>
int main()
{
    FILE *f1,*f2,*f3;
    int number;
    char ch;
    f1=fopen("input.txt","r");
    f2=fopen("odd.txt","w");
    f3=fopen("even.txt","w");
    while((ch=fscanf(f1,"%d",&number))!=EOF)
    {
        if(number%2==0)
        {
            fprintf(f3,"%d",number);
            fputc(' ',f3);
        }
        else
        {
            fprintf(f2,"%d",number);
            fputc(' ',f2);
        }
    }
    fclose(f1);
    fclose(f2);
    fclose(f3);
    f2=fopen("odd.txt","r");
    f3=fopen("even.txt","r");
    printf("\n\ncontents of ODD file\n\n");
    while((ch=fscanf(f2,"%d",&number))!=EOF)
    printf("%d\t",number);
    printf("\n\ncontents of EVEN file\n\n");
    while((ch=fscanf(f3,"%d",&number))!=EOF)
    printf("%d\t",number);
    fclose(f2);
    fclose(f3);
    return 0;
}