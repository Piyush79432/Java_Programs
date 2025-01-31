import java.util.*;
class P5
{
   public static void main(String args[])
   {
     int n,i;
    Scanner dc= new Scanner(System.in);
    Formatter f=new Formatter();
     Formatter f1=new Formatter();
    System.out.println("Enter a number:");
    n=dc.nextInt();
     f=new Formatter();
     f1=new Formatter();
   for(i=1;i<=10;i++)
    {
       System.out.println(n+ " X " +(f1.format("%2d",i))+ " = " +f.format("%3d",(n*i)));
         f=new Formatter();
        f1=new Formatter();
     }
   }
}

