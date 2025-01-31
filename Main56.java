class A extends Thread
{
   public void run()
   {
     int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
      System.out.println("Even numbers:");
     for(int i=0;i<13;i++)
     {
         if(arr[i]%2==0)
         {
          System.out.println(+arr[i]);
         }
     }
     System.out.println("End ");
   }
}
class B extends Thread
{
   public void run()
   {
     int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
     System.out.println("Odd numbers:");
     for(int i=0;i<12;i++)
     {
       if(arr[i]%2!=0)
         {
          System.out.println(+arr[i]);
         }
       
     }
     System.out.println("End");
   }
}
class C extends Thread
{
   public void run()
   {
     int arr[]={1,2,3,4,5};
     for(int i=0;i<5;i++)
     {
       System.out.println(+arr[i]);
     }
      System.out.println("End");
   }
}
class Main56
{
 public static void main(String []args)
 {
  A sc=new A();
  B sr=new B();
  C sd=new C();
  sc.start();
  sr.start();
  
 }
}