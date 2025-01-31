import java.util.*;
class Sample2{
 public static void main(String[] args){
  Vector<String> vec=new Vector(10);
  vec.add("Tiger");
  vec.add("Lion");
  vec.add("Gabriel");
  vec.add("Samael");
  vec.add("Michael");
  vec.add("Jophiel");
  vec.add("Gabriel");
  vec.add("Samael");
  vec.add("Tiger");
   
   char a= vec.get(3);
  System.out.println("Elements before sorting:"+a);
 }
}