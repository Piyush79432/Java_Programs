package Packer;
import rex.*;
import java.util.*;
class Main43
{
  public static void main(String[]args)
  {
   Scanner sc= new Scanner(System.in);
   AmtIntoWrds sr=new AmtIntoWrds();
   System.out.println("Enter number 1-999999");
   int n=sc.nextInt();
   sr.MethodA(n);
  }
}