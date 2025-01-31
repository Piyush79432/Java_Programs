class A implements Runnable
{
   public void run()
   {
     int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
      System.out.println("FIVE TABLE:");
     for(int i=0;i<13;i++)
     {
         
          System.out.println(" 5X"+arr[i]+"="+(5*arr[i]));
        
     }
     System.out.println("End ");
   }
}
class B implements  Runnable
{
   public void run()
   {
     int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
     System.out.println("SIX TABLE:");
     for(int i=0;i<12;i++)
     {
         
          System.out.println(" 6X"+arr[i]+"="+(6*arr[i]));
       
     }
     System.out.println("End");
   }
}
class C implements  Runnable
{
   public void run()
   {
     int arr[]={1,2,3,4,5,6,7,8,9,10};
     System.out.println("SEVEN TABLE:");
     for(int i=0;i<10;i++)
     {
       System.out.println(" 7X"+arr[i]+"="+(7*arr[i]));
     }
      System.out.println("End");
   }
}
class D implements Runnable
{
   public void run()
   {
     int arr[]={1,2,3,4,5,6,7,8,9,10};
     System.out.println("THIRTEEN TABLE:");
     for(int i=0;i<10;i++)
     {
       System.out.println(" 13X"+arr[i]+"="+(13*arr[i]));
     }
      System.out.println("End");
   }
}

class Main57
{
 public static void main(String []args)
 {
  new Thread(new A()).run(); 
  new Thread(new B()).run(); 
  new Thread(new C()).run();
  new Thread(new D()).run();
 }
}
