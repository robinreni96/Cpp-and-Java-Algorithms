#include<iostream>
using namespace std;
void insertionsort(int a[],int n){
  for(int i=0;i<n;i++){
    int temp=a[i];
    int j=i;
    while(j>0 && temp<a[j-1]){
      a[j]=a[j-1];
      j=j-1;
    }
    a[j]=temp;
  }
}
int main(){
  int n;
  cout<<"Enter the n:"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the values in the array:"<<endl;
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  insertionsort(a,n);
  cout<<"After Swapping: "<<endl;
  for(int i=0;i<n;i++){
    cout<<a[i]<<" ";
  }
  return 0;
}
