package Maths;
class Operation
{
   public void Factorial(int n)
   {
       int fact=1;
       for(int i=1;i<=n;i++)
       {
           fact=fact*i;
       }
     System.out.println("Factorial:"+fact);
   }
}