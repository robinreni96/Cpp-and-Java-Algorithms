#include<iostream>
using namespace std;
void sort(int a[],int n){
  int minimum;
  for(int i=0;i<n-1;i++)
  {
    minimum=i;//minimum value the initial value
    for(int j=i+1;j<n;j++){
      if(a[j]<a[minimum]){
        minimum=j;//getting the last minimum value
      }
    }
    a[i]=a[i]+a[minimum];
    a[minimum]=a[i]-a[minimum];
    a[i]=a[i]-a[minimum];
  }
  cout<<"After Swapping: "<<endl;
  for(int i=0;i<n;i++){
    cout<<a[i]<<" ";
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
  sort(a,n);
  return 0;
}
