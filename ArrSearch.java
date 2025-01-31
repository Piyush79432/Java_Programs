import java.util.*;
class ArrSearch
{
  public static void main(String []args)
  {
    int i,n,pos=0,flag=0;
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
    System.out.println(" Elements in array to be search:");
    int n1=sc.nextInt();
     for(i=0;i<n;i++)
    {
       if(a[i]==n1)
       {
         System.out.println("a["+i+"]="+a[i]);
          flag=1;
          pos=i;
       }
      
    }
     if(flag ==1)
      {
       System.out.println("Element found with index :"+pos);
      }
      else
       {
        System.out.println("Element not found");
       }
  }
}
  