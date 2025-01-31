import java.util.*;
class Book
{
  String title= "Mac Beth";
  String aname= "William Shakesphere";
  int price= 6000;
  void display()
  {
    System.out.println(" Book details are:");
    System.out.println("Name:"+title+"\nAuthor name: "+aname+"\nPrice: "+price+"\n\n");
   }
}
  class RefrenceBook extends Book
{
  String title= "Wings of Fire";
  String aname= "Dr APJ Abdul Kalam";
  int price= 7000;
  void display()
  {
    System.out.println("Reference book details are:");
    System.out.println("Name:"+title+"\nAuthor name: "+aname+"\nPrice: "+price+"\n\n");
   }
}
 class Magzine extends  Book
{
  String title= "VOGUE";
  String aname= "Jay Plague";
  int price= 4000;
  void display()
  {
    System.out.println("Magziene details are:");
    System.out.println("Name:"+title+"\nAuthor name: "+aname+"\nPrice: "+price+"\n\n");
}
}
  
  class Main5{

  public static void main(String args[])
  {
    Book sc =new Book();
    RefrenceBook sr= new RefrenceBook();
    Magzine se= new Magzine();
   
   sc.display();
   sr.display();
   se.display();
  }
}
