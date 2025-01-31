import java.util.*;
class InputMismatchException extends Exception
{  
	InputMismatchException(String error)
      {
		super(error);
	}
}
public class Main53
{
 public static void main(String[] args) {
 try
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Login Id:");
	 String loginId=sc.nextLine();
	 System.out.println("Enter password should be in 8 digit and contain atleast one digit and special character:");
	 String pass=sc.nextLine();
	 int len1=loginId.length();
	 int len2=pass.length();
	 int digi=0,alph=0,spl=0,flag=0;
	 for(int i=0;i<pass.length();i++)
	 {
	    if(len2==8)
	    {
	       if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9')
	       {
				digi++;
		   }
		   else if(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z' || pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z' ) 
		   {
				alph++;
     	   }
		   else 
		   {
			     spl++;  
		   }
	    }
	    if(digi>0 && spl>0)
	  {
	     flag=1; 
	  }
	  }
	  if(flag!=1)
	  {
	    throw(new InputMismatchException("Invalid:Password should contain atleast one digit and one special character"));
	  }
	  System.out.println("//><//LOGIN SUCCESSFULL");
	}
	  catch(InputMismatchException e)
      {
    	System.out.println("Error:"+e);
	  }
   }
}