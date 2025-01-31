import java.util.*;
class MarksOutOfBound extends Exception
{  
	MarksOutOfBound(String error)
    {
		super(error);
	}
}

 class Result
{    
	public static void main(String arg[])
    { 
		try
		{
			Scanner KB=new Scanner(System.in);
			System.out.println("Enter name of student:");
			String name =KB.nextLine();
			System.out.println("Enter Seat Number:");
			String no =KB.next();
			System.out.print("EnterSEM 2 marks here 1-100: ");
			int h=KB.nextInt();
			if(!(h>=0 && h<=100))
			{
				throw(new MarksOutOfBound("Invalid marks:"+h));
			}
			System.out.println("\n*******Student Details*******\n");
			System.out.print("Name of Student:"+name+"\nSeat NO:"+no+"\nSEM2  marks are : " + h);			
			
		}
		catch(MarksOutOfBound e)
		{
			System.out.println("Error:"+e);
		}
	}
}