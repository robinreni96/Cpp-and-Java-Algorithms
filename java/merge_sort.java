import java.util.Scanner;
public class merge_sort
{
 static void merge(int arr[],int l,int m,int r)
 {
   //find the size of two subarrays
   int n1=m-l+1;
   int n2=r-m;

   //create a temp subarrays
   int L[]=new int[n1];
   int R[]=new int[n2];

   //Copy the data to temp array
   for(int i=0;i<n1;i++) L[i]=arr[l+i];
   for(int i=0;i<n2;i++) R[i]=arr[m+1+i];

   //Merge the temp subarrays
   //initial index of the array
   int i=0,j=0;

   //initial index of merged subarrays
   int k=l;
   while(i<n1 && j<n2)
   {
     if(L[i]<=R[j])
     {
       arr[k]=L[i];
       i++;
     }
     else
     {
       arr[k]=R[j];
       j++;
     }
     k++;
   }
   while(i<n1)
   {
     arr[k]=L[i];
     i++;
     k++;
   }
   while(j<n2)
   {
     arr[k]=R[j];
     j++;
     k++;
   }
 }

  static void sort(int arr[],int l,int r)
  {
   if(l<r)
   {
     //middle point
     int m=(l+r)/2;
     //sort the first and second halves
     sort(arr,l,m);
     sort(arr,m+1,r);
     //Merge the sorted halves
     merge(arr,l,m,r);
   }
  }

  static void printArray(int a[])
  {
    int n=a.length;
    for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    System.out.println();

  }

  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++) a[i]=sc.nextInt();
    System.out.println("Given Array");
    printArray(a);
    // Sort the array by mergesort
    sort(a,0,a.length-1);
    System.out.println("Sorted Array");
    printArray(a);
  }
}
