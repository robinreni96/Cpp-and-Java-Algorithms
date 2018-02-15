import java.util.Scanner;

public class roman_integer
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter A Roman Number: ");
    String roman=sc.nextLine();
    // Convert the roman letters to UpperCase
    roman=roman.toUpperCase();
    // Length of the Roman String
    int l=roman.length();
    int num=0;
    int previousnum=0;
    int decimalNum=0;
    for(int i=l-1;i>=0;i--)
    {
      char x=roman.charAt(i);
      switch(x)
      {
        case 'I':
        previousnum=num;
        num=1;
        break;
        case 'V':
        previousnum=num;
        num=5;
        break;
        case 'X':
        previousnum=num;
        num=10;
        break;
        case 'L':
        previousnum=num;
        num=50;
        break;
        case 'C':
        previousnum=num;
        num=100;break;
        case 'D':
        previousnum=num;
        num=500;
        break;
        case 'M':
        previousnum=num;
        num=1000;
        break;
      }
      if(num<previousnum)
      {
        decimalNum=decimalNum-num;
      }
      else
      {
        decimalNum=decimalNum+num;
      }
    }
    System.out.println("The equvailent inetger is: "+decimalNum);
  }
}
