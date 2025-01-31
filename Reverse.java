import java.util.*;
class Reverse
{
  public static void main(String []args)
  {
    int i,n,temp;
    float sd=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter total number ofelements in array:");
    n=sc.nextInt();;
    int a[]=new int [n];
    System.out.println("Enter elements in array");
    for(i=0;i<n;i++)
    {
       a[i]=sc.nextInt();
    }
    System.out.println(" Elements in array are:");
     for(i=0;i<n;i++)
    {
       System.out.println("a["+i+"]="+a[i]);
      
    }
  
    for(i=0;i<n/2-1;i++)
    {
      for(int j=0;j<n-1;j++)
       {
       temp=a[i];
       a[i]=a[n-i-1];
        a[n-i-1]=temp;
       }
   }
   System.out.println("Reverse array:");
    for(i=0;i<n;i++)
    {
       System.out.println("a["+i+"]="+a[i]);
      
    }    
  
   }
}