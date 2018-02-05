#include<iostream>
using namespace std;
void linearsearch(int a[],int search,int n){
  for(int i=0;i<n;i++){
    if(a[i]==search) cout<<"The Element is found in the index:"<<i<<endl;
  }
}
int main()
{
  int n;
  cout<<"Enter the n:"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the values in the array:"<<endl;
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  int search;
  cout<<"Enter the search Value:"<<endl;
  cin>>search;
  linearsearch(a,search,n);
  return 0;
}
