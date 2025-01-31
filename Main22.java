interface SportsMan
{
   
  public void displayAll( String name,float age);    
}
class Hockey implements SportsMan
{
    Hockey()
      {
      System.out.println("Score:297 goals");
      }
      public void displayAll(String name,float age)
      {
       
      System.out.println("\nName:"+name+"\nAge:"+age);
      }
   
}
class Athele implements SportsMan
{        
      Athele()
      {
      System.out.println("Events:Participated in Rio Olympics");
      }
      public void displayAll(String name,float age)
      {
         
      System.out.println("\nName:"+name+"\nAge:"+age);
      }
   
}
public class Main22
{
public static void main(String[] args) 
{
//System.out.println("Hello World");
SportsMan sc=new Athele();
      // String name="Shon";
//float age=19;
sc.displayAll("Shon",19);
SportsMan sr =new Hockey();
       // String aname="Farhaan";
//float aage=19;
sr.displayAll("Farhaan",19);

}
}
