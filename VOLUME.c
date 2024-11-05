// volume of sphere and volume of cylinder and volume cone
#include<stdio.h>
#define PI 3.14
float volume_of_sphere(float);
float volume_of_cylinder(float,float);
float volume_of_cone(float,float);
void main()
{
    float r,h;
    int choice;
    char ch;
    do{ 
        printf("1.volume of sphere");
        printf("\n2.volume of cylinder");
        printf("\n3.volume of cone");
        printf("\nenter the choice : ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: 
            printf("enter the radius : ");
            scanf("%f",&r);
            printf("the volume of sphere is %f",volume_of_sphere(r));
            break;
            case 2: 
            printf("enter the radius and height of cylinder :");
            scanf("%f %f",&r,&h);
            printf("the volume of cylinder is %f",volume_of_cylinder(r,h));
            break;
            case 3: 
            printf("enter the radius and height of the cone : ");
            scanf("%f %f",&r,&h);
            printf("the volume of the cone is %f",volume_of_cone(r,h));
            break;
            default : 
            printf("invalid number");
        } 
        printf("\ndo you wish to continue (Y/N)");
        fflush(stdin);
        scanf("%c",&ch);
    }
    while(ch == 'Y'||ch == 'y');
}   
    
     float volume_of_sphere(float a)
        {
            return 4.0/3.0*PI*a*a*a;
        }
    float volume_of_cylinder(float a,float b)
        {
           return PI*a*a*b;
        }
    float volume_of_cone(float a,float b)
        {
            return 1.0/3.0*PI*a*a*b;
        }