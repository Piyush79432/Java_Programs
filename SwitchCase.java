import java.util.*;
int temp,sum,a,b,flag=0,n;
class SwitchCase
{
 public static void main(String[] args)
 {
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter Choice \n1.Factorial\n2.Armstrong\n3.Palindrome\n4.Prime number\n5.Fibonacci Series");
 int ch= sc.nextInt();
 switch(ch)
{
  case 1:System.out.print("Enter a number:");
    int a=sc.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++)
   {
    
    fact= fact*i;
   }
    
    System.out.print("Factorial  is :"+fact);
 case 2:
    System.out.println("Enter a number:");
     r=sc.nextInt();
     sum=0;
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
case 3:System.out.println("Enter a number:");
     y=sc.nextInt();
     sum=0;
    temp=n;
    while(n!=0)
   {
    
    rem=n%10;
    sum= sum*10 + rem;
    n=n/10;
   }
    if(sum==temp)
    {
    System.out.print("Plaindrome");
    }
    else
    {
      System.out.print("not a Palindrome");
    }
case 4:System.out.println("Enter a number:");
     u=sc.nextInt();
     for(i=2;i<=n;i++)
     {
       flag++;
     }
     if(flag==0)
     System.out.println("prime  number:");
     else
     System.out.println("not prime number:");
case 5:System.out.print("Enter a number:");
     p=sc.nextInt();
     sum=0;
     b=1;
      a=0;
     System.out.println(+a);
     for(int i=1;i<n;i++)
     {
       a=sum;
       sum= sum+b;
       b=a;
       System.out.println(sum);
     }
default :System.out.println("Invalid Choice");
   }
 }
}
