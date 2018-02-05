#include<iostream>
using namespace std;
void sort(int s[],int n){
  int temp;
  for(int i=0;i<n-1;i++){
    for(int j=0;j<n-i-1;j++){
      if(s[j]>s[j+1]){
        temp=s[j];
        s[j]=s[j+1];
        s[j+1]=temp;
      }
    }
  }
}
int main(){
  int n;
  cout<<"Enter the size of array: "<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the array values: "<<endl;
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  cout<<"Values Before Sorting"<<endl;
  for(int i=0;i<n;i++)
  {
    cout<<a[i]<<" ";
  }
  cout<<endl;
  sort(a,n);
  cout<<"Sorted Array: "<<endl;
  for(int i=0;i<n;i++){
    cout<<a[i]<<" ";
  }
  return 0;
}
