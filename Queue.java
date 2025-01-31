import java.util.*;
class Queue
{
  int max =5;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Enqueue d=new Enqueue();
    Dequeue f=new Dequeue();
    Display g=new Display();
    int rear=-1,front=-1;
    int[]queue= new int[29];
   
    
   
       int ch;
       char hi=1;
       while(hi==1)
         {
          System.out.println("operations to be conduct:\n");
          System.out.println(" \n1.Enqueue\n2.Dequeue\n3.display\n4.peek\n");
          int ch=sc.nextInt();
          switch(ch)
          {
           case 1: System.out.println("Insert a element:");
               int n=sc.nextInt();
               d.enqueue(n);
               break;
          case 2: f.dequeue();
               break;
         case 3: g.display();
               break;
         case 4: peek();
               break;
         default : System.out.println("Enter choice is invalid ") ;
       } 
       System.out.println("Do you want to repeat\n1.yes\n2.NO\nyour choice:");
       int ch=sc.nextInt();
       }
  } 
}
class Enqueue
{
  public void enqueue(int n)
 {
      if(rear==max-1)
      {
          System.out.println("Queue overflow");
      }
      else
      {
          rear=rear+1;
          queue[rear]=n;
          front=0;
      }
 }
}
class Dequeue
{
  public  void dequeue()
  {   
      if(front==-1||front>rear)
     {
       System.out.print("queue Underflow\n");
     } 
    else
    {
     
         System.out.println(frontqueue[front]);
           queue[front]=0;
          front=front+1;      

     }
     
 }
}
class Peek
{ 
  public void peek()
 {
       System.out.println("Rear=%d\nfront=%d",rear,front);
 }
}
class Display{
  public void display()
 {
     for (int i = 0; i < 5; i++)
     {
         System.out.println("Queue[%d] =%d\n",+i, +queue[i]);
     }
     
 }
}