import java.util.*;
class Sample1{
 public static void main(String[] args){
  Vector<String>vec=new Vector<String>(10);
  vec.add("Tiger");
  vec.add("Lion");
  vec.add("Gabriel");
  vec.add("Samael");
  vec.add("Tiger");
  
 
  System.out.println("Elements before sorting:"+vec);

  for(int i=0;i<6;i++)
  {   
    if(vec.contains("Tiger"))
    { 
       vec.remove("Tiger");

    }
  }
    System.out.println("Elements after sorting:"+vec);
 }
}
  
