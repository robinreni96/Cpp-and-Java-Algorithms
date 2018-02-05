import java.io.*;
import java.util.Scanner;

public class count_sort
{


   static public int[] count_sort(int a[])
   {
   	int k=0;
   	int n=a.length;
   	int sorted_array[]=new int[n];
   	// Finding the count range
   	for(int i=0;i<n;i++) 
   		{
   			if(k>a[i]) k=k;
   			else k=a[i];
   		}


   	// Create a count Array
   	int count_array[]=new int[k+1];

   	// Intialize all the values of the count to zero
   	for(int i=0;i<=k;i++) count_array[i]=0;
     
   	// Now increment the count value when the value exists
   	for(int i=0;i<n;i++) count_array[a[i]]++;
    
    // Set the index value for sorted array
   	int index=0;

   
    // Since the count index are arranged in ascending order we just want to print the values with respective to its frequency sequentially
    for(int i=0;i<=k;i++)
    {
    	int temp=count_array[i];

    	// When the temp value is zero terminate the loop
    	while(temp!=0)
    	{
           sorted_array[index]=i;
           index++;
           temp--;
       }
    }

    return sorted_array;

   	}


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		a=count_sort(a); 
	    for(int i=0;i<n;i++) System.out.print(a[i]+" ");

	}
}