// #include <stdio.h>
// int main()
// {
//     int a,b,c,d,e;
//     double p,sum;
//     printf("Enter the marks of maths    :");
//     scanf("%d",&a);
//     printf("enter the marks of physics  :");
//     scanf("%d",&b);
//     printf("enter the marks of english  :");
//     scanf("%d",&c);
//     printf("enter the marks of chemistry:");
//     scanf("%d",&d);
//     printf("enter the marks of hindi    :");
//     scanf("%d",&e);
//     sum = a+b+c+d+e;
//     printf("the sum is %.1lf",sum);
//      printf("\n");
//     p=(a+b+c+d+e)/5;
//     printf("the percentage is %.1lf",p);
//     return 0;

// }
// #include <stdio.h>
// int main()
// {
//     float bs,da,hra,pf,ns,gs;
//     printf("enter the basic salary :");
//     scanf("%f",&bs);
//     da=0.25*bs;
//     hra=0.15*bs;
//     gs=bs+da+hra;
//     pf=0.1*gs;
//     ns=gs-pf;
//     printf("the net salary is %.2f",ns);
//     return 0;
// }
// #include <stdio.h>
// int main()
// {
//     int a,b;
//     printf("enter the two values :");
//     scanf("%d%d",&a,&b);
//     a=a+b;
//     b=a-b;
//     a=a-b;
//     printf("the value of a is %d\n",a);
//     printf("the value of b is %d",b);
//     return 0;
// }
// #include <stdio.h>
// int main()
// {
//     int a,b,c;
//     printf("enter two values :");
//     scanf("%d%d",&a,&b);
//     c=a;
//     a=b;
//     b=c;
//     printf("the value of a is %d\n",a);
//     printf("the value of b is %d",b);
//     return 0;
// }
// #include <stdio.h>
// int main()
// {
//     int n;
//     printf("enter the number :");
//     scanf("%d",&n);
//     n%2==0? printf("even number"):printf("odd number");
//     return 0;
// }
// #include <stdio.h>
// int main ()
// {
//     int year;
//     printf("Enter the year :");
//     scanf("%d",&year);
//     year%400==0?printf("leap year"):
//     year%100==0?printf("not a leap year"):
//     year%4==0?printf("leap year"):printf("not a leap year");
//     return 0;
// }
// #include<stdio.h>
// int main()
// {
//     int a,b,c;
//     printf("enter the three numbers :");
//     scanf("%d%d%d",&a,&b,&c);
//     if(a>b)
//     {
//         if(a>c)
//         {
//             printf("%d is the greatest",a);
//         }
//         else
//         {
//             printf("%d is the greatest",c);
//         }
//     }
//     else 
//     {
//          if(b>c)
//          {
//             printf("%d is the greatest",b);
//          }
//          else
//          {
//             printf("%d is the greatest",c);
//          }
//     }
   
// }
// #include <stdio.h>
// int main()
// {
//     int a,b,c,d,e;
//     float p;
//     printf("enter the marks of five subjects :");
//     scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
//     p=(a+b+c+d+e)/5;
//     printf("%f is the percantage of the five subjects",p);
//     printf("\n");
//     if(p>=90&&p<=100)
//     {
//         printf("grade A");
//     }
//     else if(p>=80)
//     {
//         printf("grade B");
//     }
//     else if(p>=60)
//     {
//         printf("grade C");
//     }
//     else
//     {
//         printf("grade D");
//     }
//     return 0;
// }
// #include <stdio.h>
// int main()
// {
//     int a,x,b,n;
//     float y;
//     printf("enyter the value of a,x,b,n :");
//     scanf("%d%d%d%d",&a,&x,&b,&n);
//     switch(n)
//     {
//         case 1: n=1;
//     y = a*x%b;
//     printf("y=%.2f",y);
//     break;
//     case 2: n=2;
//     y = (float)a*x*x+b*b;
//     printf("y=%.2f",y);
//     break;
//     case 3: n=3;
//     y = (float)a-b*x;
//     printf("y=%.2f",y);
//     break;
//     case 4: n=4;
//     y = (float)a+x/b;
//     printf("y=%.2f",y);
//     break;
//     default:
//     printf("invalid number");
//     }
//     return 0;
// }
