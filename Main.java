import java.util.*;
class Main{
     Main(String en,int g, String d){
     String name=en;
     int doj=g;
     String address=d;
     System.out.println(name+  "   "  +doj+  "  "  +address);
   }
 public static void main(String[] args)
 {
System.out.println("\n Name   DOJ   Address");
    
   Sample sc=new Sample("Ramesh",  1942,"  AD street");
   Sample sr=new Sample("Rakesh",  2002,"  Gc Street");
   Sample so=new Sample("Manish",  1975,"  Aqueduct street");
   
  }
}
