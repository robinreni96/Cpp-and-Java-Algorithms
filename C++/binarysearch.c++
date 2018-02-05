#include<iostream>
using namespace std;
void binarysearch(int a[],int n,int s)
{
  int first=0,last=n-1;
  if(first<=last){
    int mid=first+last/2;
    if(a[mid]<s) first=mid+1;
    else if(a[mid]>s) last=mid-1;
    else cout<<"Element Found in the Position: "<<mid+1<<endl;
  }
}
void sort(int a[],int n)
{
  for(int i=0;i<n-1;i++)
  {
    for(int j=0;j<n-i-1;j++)
    {
    if(a[j]>a[j+1])
    {
      a[j]=a[j]+a[j+1];
      a[j+1]=a[j]-a[j+1];
      a[j]=a[j]-a[j+1];
    }
  }
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
  sort(a,n);
  cout<<"Sorted Array: "<<endl;
  for(int i=0;i<n;i++){
    cout<<a[i]<<" ";
  }
  cout<<endl;
  int s;
  cout<<"Enter the Search Value"<<endl;
  cin>>s;
  binarysearch(a,n,s);
  return 0;
}
