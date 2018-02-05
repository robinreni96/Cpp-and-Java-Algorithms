public class duplicate
{

	static boolean duplicate(int temp[],int a,int index)
	{
		int flag=0;
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]==a) return true;
			else flag=1;
		}
		if(flag==1)
		{
           temp[index]=a;
           index++;
           return false;
		}
		return false;
	}
	public static void main(String args[])
	{
		int index=0;
		int a[]={1,2,4,4,1,3,7,5,5,2};
		int temp[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(duplicate(temp,a[i],index))
			{
				System.out.println(a[i]);
				break;
			}
		}
	}
}