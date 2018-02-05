#include<iostream>
using namespace std;
void swap(int a,int b){
  a=a+b;
  b=a-b;
  a=a-b;
}
int partition(int a[],int start,int end){
  int i=start+1;
  int pivot=start;
  for(int j=start+1;i<end;i++)
  {
    if(a[j]<pivot)
    {
      swap(a[i],a[j]);
      i+=1;
    }
  }
    swap(a[start],a[i-1]);
    return i-1;
}
void quick_sort(int a[],int start,int end){
  if(start<end){
    int pivot=partition(a,start,end);
    quick_sort(a,start,pivot-1);
    quick_sort(a,pivot+1,end);
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
  int start=0,end=n-1;
  quick_sort(a,start,end);
  cout<<"Sorted Array: "<<endl;
  for(int i=0;i<n;i++){
    cout<<a[i]<<" ";
  }
  return 0;

}
