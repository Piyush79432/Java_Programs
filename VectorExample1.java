import java.util.*;
 public class VectorExample1 {
 public static void main(String args[]) {
 //Create an empty vector with initial capacity 4
 Vector<String> vec = new Vector<String>(4);
 //Adding elements to a vector
 vec.add("Tiger");
 vec.add("Lion");
 vec.add("Dog");
 vec.add("Elephant");
 vec.add("Elephant");
 vec.add("Elephant");
 vec.add("Elephant");
 int n=vec.size();
 System.out.println(" before Sorting are:"+vec);
  for(int i=0;i<n;i++)
  {
    if(vec.get(i)=vec.get(i+1))
    {
         vec.remove(i);
    }
   }
    System.out.println("After Sorting :"+vec);
 }
}