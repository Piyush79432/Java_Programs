import java.util.*;
class Pattern
{
   public static void main(String args[])
   {
     int n,i;
    Scanner dc= new Scanner(System.in);
    System.out.println("Enter a number:");
    n=dc.nextInt();
   for(i=1;i<=n;i++)
    {
      if(i%2!=0)
      {
        for(int j=1;j<=i;j++)
        {
          if(j%2==0)
          {
          System.out.print("0");
          } 
         else
         {
          System.out.print("1");
         }
        }
       }
       else
       {
           if(i%2==0)
           {
           for(int j=1;j<=i;j++)
           {
            if(j%2==0)
            {
             System.out.print("1");
            } 
            else
           {
           System.out.print("0");
           }
         }
       }
      }
      System.out.print("\n");
     }
   }
}

