import java.io.*;
class matrix
{
  int A[][]=new int[10][10];
  int B[][]=new int[10][10];
  int C [][]=new int[20][20];
  int r1,r2,c1,c2,i,j,k;
  void multiply()throws IOException
  {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the size of matrix A");
  r1 =Integer.parseInt(br.readLine());
  c1=Integer.parseInt(br.readLine());
  System.out.println("Enter the size of matrix B");
  r2=Integer.parseInt(br.readLine());
  c2=Integer.parseInt(br.readLine());
  if(c1==r2)
  {
   System.out.println("enter the elements of A");
   for(int i=0;i<r1;i++)
   for(int j=0;j<c1;j++)
    A[i][j]=Integer.parseInt(br.readLine());
   System.out.println("enter the elements of B");
   for(int i=0;i<r2;i++)
   for(int j=0;j<c2;j++)
    B[i][j]=Integer.parseInt(br.readLine());
   for(i=0;i<r1;i++)
   for(j=0;j<c2;j++)
   {
   C[i][j]=0;
   for(k=0;k<c1;k++)
   {
    C[i][j]+=A[i][k]*B[k][j];
   }
   }
   System.out.println("the resultant matrix");
   for(i=0;i<r1;i++)
{    
for(j=0;j<c2;j++)
 {
  System.out.print( C[i][j]+"\t");
 }
 System.out.println("");
}
}
else 
 System.out.println("Multiplication is not possible");
}
}
class matrixmul
{
 public static void main(String args[])throws IOException
{
matrix m=new matrix();
m.multiply();
}
}
