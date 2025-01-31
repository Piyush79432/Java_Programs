import java.util.Scanner;
class SimpleInterest
{
   public static void main(String[] args)
   {
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter a Principal Amount:");
     float P=sc.nextFloat();
     System.out.print("Enter a Rate of interset:");
     float R=sc.nextFloat();
     System.out.print("Enter Number of days:"); 
     float N=sc.nextFloat();
     float SI=(P*R*N)/100;
     System.out.println("Simple interest:"+SI);
  }
}