import java.util.Scanner;
class fibonacci
{
  public static void main(String args[])
  { 
    int a=0,b=1,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:\n");
    int n=sc.nextInt();
    System.out.println(a);
    System.out.println(b);
    for(int i=2;i<n;i++)
    {
     c=a+b;
     System.out.println(c + "\t");
     a=b;
     b=c;
    }
  }
}
