import java.util.*;
class in_details
{
 public
  int roll_no;
  in_details(int n)
  {
    roll_no=n;
  }
  void display()
  {
   System.out.println("student details:");
   System.out.println("id:"+roll_no);
  }
}
class student_details
{
 public static void main(String args[])
 {
  System.out.println("enter student details:id and name");
  Scanner S=new Scanner(System.in);
  int roll_no=S.nextInt();
  //String name=S.next();
  in_details obj=new in_details(roll_no);
  obj.display();
 }
}
