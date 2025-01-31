import java.util.Scanner;
class Teacher
{
     String title;
  String aname;
   int price;
    Scanner sc=new Scanner(System.in);
  Teacher()
  {
   System.out.println("Enter Teacher Details:");
  }
  
}

class AssociateProffesor extends Teacher
{
   
  AssociateProffesor()
  {
      Scanner sc=new Scanner(System.in);
  System.out.println("Enter Associate Proffesor name:");
  String title = sc.nextLine();
  System.out.println("Enter Associate Proffesor Department:");
  String aname = sc.nextLine();
  System.out.println("Enter Associate Proffesor id:");
  int price = sc.nextInt();
   display(title, aname, price);
  }
 void display(String title,String aname,int price)
  {
    System.out.println ("\n\n****************Associate Proffesor details are:****************\n\n");
   System.out.println ("Name:" +title+ "\nDepatment: " +aname+	"\nID: " +price+ "\n******************************************************\n");
  }
}
class Professor extends Teacher
{
   
  Professor()
  {
      Scanner sc=new Scanner(System.in);
  System.out.println("Enter Professor name:");
  String title = sc.nextLine();
  System.out.println("Enter Professor Department:");
  String aname = sc.nextLine();
  System.out.println("Enter Professor id:");
  int price =sc.nextInt();
   display(title, aname, price);
  }
  void display(String title,String aname,int price)
  {
    System.out.println ("\n\n***************************Professor details are:*******************\n\n");
   System.out.println ("Name:"+title+"\nDepatment: "+aname+"\nID: "+price+"\n****************************************************\n");
  }
}

class Main6
{

  public static void main (String args[])
  {
    Teacher sc = new Teacher();
    Professor sr = new Professor();
    AssociateProffesor se = new AssociateProffesor();

     
  }
}
