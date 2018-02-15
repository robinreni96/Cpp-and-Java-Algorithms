import java.util.Scanner;
public class n_digit_number
{

  void tree(int i,int level,int n,int number,int N,int predecessor[])
  {
    int j,k;
    if(level==n)
    {
      number++;
      System.out.print(number+" ");
      System.out.println();
      for(k=2;k<=n;k++)
      System.out.print(predecessor[k]+" ");
      System.out.println();
      //System.out.print(i+" ");
    }
    else
    {
      for(j=1;j<=N;j++)
      if(j>=1)
      {
        predecessor[level+1]=i;
        tree(j,level+1,n,number,N,predecessor);
      }
    }
  }

  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int N=n-1;
    int predecessor[]=new int[n+1];
    int number=0;
    int i;
    n_digit_number np=new n_digit_number();
    for(i=1;i<=N;i++)
    np.tree(i,1,n,number,N,predecessor);
    }

  }
