import java.util.*;
class TwoD
{
  public static void main(String []args)
  {
    int i,n,temp;
    float sd=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter total number of rows in array:");
    int m=sc.nextInt();
    System.out.println("Enter total number of columns in array:");
    n=sc.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];
    int c[][]=new int[m][n];
    System.out.println("Enter elements in 1st Matrix");
    for(i=0;i<m;i++)
    {
       for(int j=0;j<n;j++)
      {
       a[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter elements in 2nd Matrix");
    for(i=0;i<m;i++)
    {
       for(int j=0;j<n;j++)
      {
       b[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter elements in 1st Matrix");
    for(i=0;i<m;i++)
    {
       for(int j=0;j<n;j++)
      {
       c[i][j]=a[i][j]+b[i][j];
      }
    }
    System.out.println(" Additon of two matrices are:");
     for(i=0;i<m;i++)
    {
       for(int j=0;j<n;j++)
       {
        System.out.print(c[i][j]+"\t");
       }
      System.out.print("\n");
    }
  }
}