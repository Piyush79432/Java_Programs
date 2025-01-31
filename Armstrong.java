import java.util.*;
class Armstrong
{
   public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int sum=0,temp,rem;
    temp=n;
    while(n!=0)
   {
    
    rem=n%10;
    sum= sum + rem*rem*rem;
    n=n/10;
   }
    if(sum==temp)
    {
    System.out.print("Armstrong");
    }
    else
    {
      System.out.print("not a Armstrong");
    }
  }
}