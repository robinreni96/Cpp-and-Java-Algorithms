#include<iostream>
using namespace std;
void Enqueue(char q[],char f,int rear,int arraysize)
{
	if(rear==arraysize) cout<<"Queue Overflow"<<endl;
	else
	{
		q[rear]=f;
		rear++;
	}
}
void Dequeue(char q[],int front,int rear)
{
	if(front==rear) cout<<"Queue Underflow"<<endl;
	else
	{
		q[front]=0;
		front++;
	}

}
char Front(char q[],int front)
{
	return q[front];
}

int main()
{
	char q[20]={'a','b','c','d'};
	int arraysize=20;
	int n=3;
	char f;
	int front=0,rear=4;
	for(int i=0;i<n;++i)
	{
		f=Front(q,front);
		Enqueue(q,f,rear,arraysize);
		Dequeue(q,front,rear);

	}
	for(int i=front;i<rear;++i)
	{
		cout<<q[i]<<" ";
	}
	return 0;
}
