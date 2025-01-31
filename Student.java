import java.util.*;
class Student
{
  public Student()
 {
   System.out.println("Name:Unknown");
  }
  Student(String i)
 {
   System.out.println("Name:"+i);
 }
 public static void main(String[]args)
 {
  Student sc=new Student("Ravi");
  Student sr=new Student("Rahul");
  Student sq=new Student("Varun");
  Student sp=new Student();
 }
}