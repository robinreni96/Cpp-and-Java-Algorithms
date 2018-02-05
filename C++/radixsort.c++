#include<iostream>
using namespace std;
int maximum(int a,int b)
{
  if(a>b) return a;
  else return b;
}
void countsort(int a[],int n,int place){
  int i,range=10,freq[range];int output[n];
  for(int i=0;i<range;i++) freq[i]=0;
  for(int i=0;i<n;i++) freq[(a[i]/place)%range]++;
  for(int i=1;i<range;i++) freq[i]+=freq[i-1];
  for(int i=n-1;i>=0;i--){
    output[freq[(a[i]/place)%range]-1]=a[i];
    freq[(a[i]/place)%range]--;
  }
  for(int i=0;i<n;i++)
  a[i]=output[i];
}
void radixsort(int a[],int n,int max){
  int mul=1;
  while(max){
    countsort(a,n,mul);
    mul*=10;
    max=max/10;
  }
}
int main()
{
  int n;
  cout<<"Enter the size of array: "<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the array values: "<<endl;
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  int max=0;
  for(int i=0;i<n;i++)
  max=maximum(max,a[i]);
  radixsort(a,n,max);
  cout<<"Sorted Array: "<<endl;
  for(int i=0;i<n;i++){
    cout<<a[i]<<" ";
  }
  return 0;
}
