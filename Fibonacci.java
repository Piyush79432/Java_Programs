import java.util.*;
class Fibonacci
{
   public static void main(String[] args)
   {
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter a number:");
     int n=sc.nextInt();
     int sum=0,b=1,a=0;
     System.out.println(+a);
     for(int i=1;i<n;i++)
     {
       a=sum;
       sum= sum+b;
       b=a;
       System.out.println(sum);
     }
  }
}