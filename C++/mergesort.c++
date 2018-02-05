#include<iostream>
using namespace std;
void merge(int a[],int start,int mid,int end){
  int p=start,q=mid+1;
  int Arr[end-start+1],k=0;
  for(int i=start;i<=end;i++){
    if(p>mid)
    Arr[k++]=a[q++];
    else if(q>end)
    Arr[k++]=a[p++];
    else if(a[p]<a[q])
    Arr[k++]=a[p++];
    else
    Arr[k++]=a[q++];
  }
    for(int i=0;i<k;i++)
  {
      a[start++]=Arr[i];
  }

}
void merge_sort(int a[],int start,int end){
  if(start<end){
    int mid= (start+end) /2;
  merge_sort(a,start,mid);
  merge_sort(a,mid+1,end);
  merge(a,start,mid,end);
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
  int start=0,end=n-1;
  merge_sort(a,start,end);
  cout<<"After Sorting: "<<endl;
  for(int i=0;i<n;i++){
    cout<<a[i]<<" ";
  }
  return 0;
}
