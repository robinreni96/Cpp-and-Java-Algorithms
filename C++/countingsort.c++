#include<iostream>
using namespace std;
int max(int a,int b){
  if(a>b) return a;
  else return b;
}
void countsort(int a[],int n)
{
  int sorted_array[n];
  int k=0;
  for(int i=0;i<n;i++)
  k=max(k,a[i]);
  int Aux[k];
  for(int i=0;i<=k;i++)
  Aux[i]=0;
  for(int i=0;i<n;i++)
  Aux[a[i]]++;
  int j=0;
  for(int i=0;i<=k;i++){
    int temp=Aux[i];
    while(temp--){
      sorted_array[j]=i;
      j++;
    }
  }
  cout<<"Sorted Array is :"<<endl;
  for(int i=0;i<n;i++)
  {
    cout<<sorted_array[i]<<" ";
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
  countsort(a,n);
  return 0;
}
