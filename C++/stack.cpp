#include<iostream>
using namespace std;
int top=-1;
void pop(int stack[]){
  if(top==-1){
    cout<<"Stack is empty";
  }
  else{
    cout<<"Popping Element: "<<stack[top]<<endl;
    top=top-1;
  }
}
void push(int stack[],int x,int n)
{
  if(top==n-1){
    cout<<"Stack Overflow";
  }
  else{
    top+=1;
    stack[top]=x;
  }
}
int size(){
  return top+1;
}
int topelement(int stack[]){
  return stack[top];
}
int main() {
  /* code */
  int stack[3];
  push(stack,4,3);
  push(stack,51,3);
  cout<<"Size of the Stack"<<size()<<endl;
  push(stack,20,3);
  cout<<"Last Element"<<topelement(stack)<<endl;
  for(int i=0;i<3;i++)
  pop(stack);
  cout<<"Size of Stack: "<<size()<<endl;


}
