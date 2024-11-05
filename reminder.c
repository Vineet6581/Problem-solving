//wap to check leap year
#include<stdio.h>
void main(){
    int a,b,c;
    printf("Enter the value of three numbers :");
    scanf("%d%d%d",&a,&b,&c);
    a>b?a>c? printf("a is greater"):printf("c is greater"):b>c?printf("b is greater"):printf("c is greater");
   printf("\n");
//    int q = a/b;            // Divident(a) / Divisor(b)
//    int r = a-(b*q);         // divisor*quotient + reminder = Divident
//    printf("the reminer when %d is divided by %d is : %d",a,b,r);
int r = a%b;
printf("the reminer when %d is divided by %d is : %d",a,b,r);

    
}