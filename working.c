// wap to show the working of a single linked list by inserting nodes at the beggining of the linked list.
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*next;
};
struct node*head = NULL;
void printlist()
{
    struct node*ptr = head;
    while(ptr!=NULL)
    {
        printf("%d->",ptr->data);
        ptr = ptr->next;
    }
}
void insert(int data)
{
    struct node*new = (struct node*)
    malloc(sizeof(struct node));
    new->data=data;
    new->next=head;
    head=new;
}
int main()
{
    insert(20);
    insert(10);
    insert(30);
    insert(1);
    insert(40);
    insert(50);
    printlist();
    return 0;
}