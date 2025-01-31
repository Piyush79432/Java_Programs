import java.util.*;
class MenuDriven{
 public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("1)factorial,2)testarmstrong,3)testpalindrome,4)testprime,5)fibonacci");
         System.out.println("enter your choice (1-5):");
         int choice=sc.nextInt();
         switch(choice){
                        case 1:{
                                int fact=1;
                                System.out.println("enter the number:");
                                int num=sc.nextInt();
                                if(num<0){
                                 System.out.println("error");
                                }
                                else{
                                    for(int i=1;i<=num;++i){
                                    fact=fact*i; 
                                 }
                                 }
                                   System.out.print("factorial of the given number is:");
                                  System.out.println(fact);
                                break;
                               }
                        case 2:{
                                int rem,result=0;
                                System.out.println("enter the number:");
                                int num=sc.nextInt();
                                int org=num;
                                while(num!=0){
                                             rem=num%10;
                                             result=result+rem*rem*rem;
                                             num=num/10;
                                             }
                                if(org==result){
                                                System.out.println("Armstrong number");
                                 }
                                else{
                                                System.out.println("not a Armstrong number");
                                 }
                                  break;
                                 }
                         case 3:{
                                 int reversed = 0,rem;
                                 System.out.println("Enter an integer:");
                                 int num=sc.nextInt();
                                 int org=num;
                                 while(num!=0){
                                 rem= num%10;
                                 reversed = reversed * 10 + rem;
                                 num/=10;
                                 }
                                 if (org == reversed){
                                  System.out.println("palindrome");
                                 }
                                 else {
                                 System.out.println("not a palindrome number");
                                 }
                                 break;
                                 }
                          case 4:{
                                  System.out.println("Enter number:"); 
                                  int num = sc.nextInt();
                                  boolean flag = false;
                                  for (int i = 2; i <= num / 2; ++i) {
                                  if (num % i == 0) {
                                  flag = true;
                                  break;
                                  }
                                  }
                                 if (!flag){
                                 System.out.println(num + " is a prime number.");
                                 }
                                 else{
                                 System.out.println(num + " is not a prime number.");
                                 }
                                 break;
                                 }
                          case 5:{ 
                                   System.out.println("Enter number of terms");
                                   int n=sc.nextInt();
                                  int  firstTerm = 0, secondTerm = 1;
                                  System.out.println("Fibonacci Series till " + n + " terms:");
                                  for (int i = 1; i <= n; ++i)
                                  {
                                  System.out.print(firstTerm + ", ");
                                  int nextTerm = firstTerm + secondTerm;
                                  firstTerm = secondTerm;
                                  secondTerm = nextTerm;
                                 }
                                 break;
                                 }
                          default:{
                                   System.out.println("invalid choice");
                                  break;
                                  }
         }
 }
}
