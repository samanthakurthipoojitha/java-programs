import java.util.*;
class primeno
{
 public static void main(String args[])
 {
   int i,j,fact;
   System.out.print("Enter the value of n:");
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   for(i=1;i<=n;i++)
   {
     fact=0;
     for(j=1;j<=n;j++)
     {
       if(i%j==0)
       fact++;
     }
     if(fact==2)
       System.out.println(i);
   }
  }
}
