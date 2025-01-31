import java.util.Scanner;
class Employee
{
 
   Employee()
   {
       Scanner sc=new Scanner(System.in);
         
           System.out.println("Enter Employee name:");
           String  Ename=sc.nextLine();
           System.out.println("Enter Employee ID:");
           int Eid=sc.nextInt();
           GetData(Ename,Eid);
          
   }
   public void GetData(String Ename,int Eid)
        {
           System.out.println("Employee name:"+Ename);
        
           System.out.println("Enter Employee ID:"+Eid);
         
        }
}
class Salary extends Employee
{
	Salary()	
	{
            Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the basic salary of an employee");
       int  Bsalary=sc.nextInt();
        calculate(Bsalary);
       }
        public void calculate(int Bsalary) 
     {
        double HRA=(10/100)*Bsalary;
        double DA=(73/100)*Bsalary;
       double GS=Bsalary+DA+HRA;
       double incometax=(30/100)*GS;
       double netsalary=GS-incometax;
         System.out.println("Salary of Employee :"+netsalary);
     }
  
}
class Main11
{
  public static void main(String[]args)
  {
    
    Salary sl=new Salary() ;
   }
}