import java.util.*;
class P5
{
   public static void main(String args[])
   {
     int n,i;
    Scanner dc= new Scanner(System.in);
    System.out.println("Enter a number:");
    n=dc.nextInt();
   for(i=1;i<=10;i++)
    {
       System.out.println(n+"X"+i+"="+(n*i));
     }
   }
}

