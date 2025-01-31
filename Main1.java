import java.util.*;
public class Main1 {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter coefficient of real terms : ");
   int a=sc.nextInt();
   int d=sc.nextInt();
   System.out.println("Enter coefficient of Imaginary terms : ");
   int b=sc.nextInt();
   int s=sc.nextInt();

 ComplexNumber c1 = new ComplexNumber();
  c1.sum(a, b,d,s);
 c1.difference(a,b,d,s); 
 c1.product(a,b,d,s);
 }
}
class ComplexNumber
{
  public void sum(int a,int b ,int d,int s)
  {
  int sum=a+d;
  System.out.println("sum of two complex numbers: " +sum+"+"+(b+s)+"i");
 }

  public void difference(int p,int j,int o,int r)
  {

  int diff=p-o;
   System.out.println("difference of two complex numbers: " +diff+"-"+(j-r)+"i");
 }
  public void product(int p,int j,int o,int r)
  {

  int diff=p-o;
   System.out.println("Product of two complex numbers: " +((p*o-j*r))+"+"+(p*r+j*o)+"i");
 }
} 