import java.util.*;
class Employee
{
     Employee(String en,int g, String d){
     String name=en;
     int doj=g;
     String address=d;
     System.out.println(name+  "  "  +doj+  ""  +address);
   }
 
 public static void main(String[] args)
 { 
    System.out.println(" Name   DOJ   Address");
    
   Employee sc=new Employee("Ramesh",  1942,"  AD street");
   Employee sr=new Employee("Rakesh",  2002,"  Gc Street");
   Employee so=new Employee("Manish",  1975,"  Aqueduct street");
   
  }
}
 
     