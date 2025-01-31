import java.util.*;
class Queue
{
  int max =5;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);



 int queue[max],rear=-1,front=-1;
 void enqueue(int);
 void dequeue();
 void display();
 void peek();
 int n,i,hi=1;
 int main()
 {
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
            enqueue(n);
            break;
     case 2: dequeue();
            break;
     case 3: display();
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
void enqueue(int n)
{
     if(rear==max-1)
     {
         system.out.println("Queue overflow");
     }
     else
     {
         rear=rear+1;
         queue[rear]=n;
         front=0;
     }
}
 void dequeue()
 {   
     if(front==-1||front>rear)
    {
      System.out.print("queue Underflow\n");
    } 
   else
   {
     
        System.out.println("Queue[%d]=%d",front,queue[front]);
           queue[front]=0;
        front=front+1;      

     }
     
 }
 void peek()
 {
       System.out.println("Rear=%d\nfront=%d",rear,front);
 }
  void display()
 {
     for (int i = 0; i < 5; i++)
     {
         System.out.println("Queue[%d] =%d\n",+i, +queue[i]);
     }
     
 }