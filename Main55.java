class A extends Thread
{
   public void run()
   {
     int arr[]={1,2,3,4,5};
     for(int i=0;i<5;i++)
     {
       System.out.println(+arr[i]);
     }
     System.out.println("End ");
   }
}
class B extends Thread
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
class Main55
{
 public static void main(String []args)
 {
  A sc=new A();
  B sr=new B();
  C sd=new C();
  sc.start();
  
 }
}