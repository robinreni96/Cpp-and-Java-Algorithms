/"""
COUNT SORT 

For simplicity, consider the data in the range 0 to 9. 
Input data: 1, 4, 1, 2, 7, 5, 2
  1) Take a count array to store the count of each unique object.
  Index:     0  1  2  3  4  5  6  7  8  9
  Count:     0  2  2  0   1  1  0  1  0  0

  2) Modify the count array such that each element at each index 
  stores the sum of previous counts. 
  Index:     0  1  2  3  4  5  6  7  8  9
  Count:     0  2  4  4  5  6  6  7  7  7

The modified count array indicates the position of each object in 
the output sequence.
 
  3) Output each object from the input sequence followed by 
  decreasing its count by 1.
  Process the input data: 1, 4, 1, 2, 7, 5, 2. Position of 1 is 2.
  Put data 1 at index 2 in output. Decrease count by 1 to place 
  next data 1 at an index 1 smaller than this index.

  """/


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