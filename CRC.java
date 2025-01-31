import java.util.*;
public class CRC
{
   public static void main(String[] args) 
   {
    Scanner sc= new Scanner(System.in);
    BinaryToDecimal bin=new BinaryToDecimal();
    DecimalToBinary dec=new DecimalToBinary();
    ArrayList<Integer> ar=new  ArrayList<>();
    int a=0,a1=0,a3=0;
    int arr1[]=new int[32];
    int arr2[]=new int[5];
    int cdwrd[]=new int[19];
    System.out.println("Enter number of data  bits:");
    int n1=sc.nextInt();
    for(int i=0;i<n1;i++)
    {
     System.out.println("Enter data  bits:");
     int az=sc.nextInt();
     arr1[i]=az;
    }
    for(int i=0;i<n1;i++)
    {
     a=a*10+arr1[i];
    }
    System.out.println("Enter number of Generator  bits:");
    int n2=sc.nextInt();
    for(int i=0;i<n2;i++)
    {
     System.out.println("Enter generator  bits:");
     int a2=sc.nextInt();
     arr2[i]=a2;
    }
    for(int i=0;i<n2;i++)
    {
     a1=a1*10+arr2[i];
    }
    System.out.println("Data bits are:"+a);
    System.out.println("Generator bits are:"+a1);
    System.out.print("Enter the length of code word:");
    int n=sc.nextInt();
    int lc=n-n1;
    for(int i=0;i<lc;i++)
    {
     arr1[n1+i]=0;
    }
    for(int i=0;i<n;i++)
    {
     a3=a3*10+arr1[i];
    }
    System.out.println("Data bits are:"+a3);
    int result1=bin.getDecimal(a3);
    int result2=bin.getDecimal(a1);
    int cod1=result1%result2;
    a=dec.toBinary(cod1,lc);
    for(int i=0;i<lc;i++)
     {
      arr1[i+n1]=a%10;
      a=a/10; 
     }
    a3=0;
     for(int i=0;i<n;i++)
    {
     
     a3=a3*10+arr1[i];
    }
    System.out.println("Code word are:"+a3);
    System.out.println("***********Reciver Side***********");
     for(int i=0;i<n;i++)
    {
     System.out.println("Enter the code word:");
     int cadw=sc.nextInt();
     cdwrd[i]=cadw;
    }
        int cadw=0;
     for(int i=0;i<n;i++)
    {
     cadw=cadw*10+cdwrd[i];
    }
    System.out.println("Cdwrd:"+cadw);
    int res1=bin.getDecimal(cadw);
     res1= res1%result2;
    System.out.println("Remainder:"+res1);
    
    } 
}
class DecimalToBinary
{    
   public  int toBinary(int decimal,int len)
   {    
      int a=0;
     int binary[] = new int[40];    
     int index = 0;    
     while(decimal > 0)
     {    
       binary[index++] = decimal%2;    
       decimal = decimal/2;    
     }    
     for(int i=0;i<len;i++)
    {
     a=a*10+binary[i];
    }
     return(a);
    }
}
class BinaryToDecimal{    
public static int getDecimal(int binary){  
    int decimal = 0;  
    int n = 0;  
    while(true){  
      if(binary == 0){  
        break;  
      } else {  
          int temp = binary%10;  
          decimal += temp*Math.pow(2, n);  
          binary = binary/10;  
          n++;  
       }  
    }  
    return decimal;  
 }
}