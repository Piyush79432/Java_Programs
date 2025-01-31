import java.util.*;
class BasicSalary{
       public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter employee name:");
          String empname=sc.nextLine();
          System.out.println("Enter basic salary:");
          float basic=sc.nextFloat();
          System.out.println("Enter employee number:");
          int empno=sc.nextInt();
          float DA=(70*basic)/100;
          float HRA=(30*basic)/100;
          float CCA=240;
          float PF=(10*basic)/100;
          float PT=100;
          float grosssalary;
          float netsalary;
          grosssalary=basic+DA+HRA+CCA;
          netsalary=grosssalary-PF-PT;
          System.out.println("name:");
          System.out.println(empname);
          System.out.print("grosssalary:");
          System.out.println(grosssalary);
          System.out.print("netsalary:");
          System.out.println(netsalary);
}
}
