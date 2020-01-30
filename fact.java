import java.util.Scanner;
class fact
{
  public static void main(String args[])
  {
   int i;
   System.out.println("Enter value of n:\n");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(i=n-1;i>0;i--)
   {
     n=n*i;
   }
   System.out.println(n);
  }
}
