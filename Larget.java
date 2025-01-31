import java.util.*;
class Larget
{
  public static void main(String []args)
  {
    int i,n,lar=0;
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
    lar=a[0];
    for(i=0;i<n;i++)
    {
       if(lar<a[i])
       lar=a[i];
   
       
    }    
    System.out.println("Largest element in array :"+lar);
   }
}