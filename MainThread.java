import java.util.*;
class Table
{
    synchronized void printtable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"X"+i+"="+(n*i));
        }
    }
}
public class MainThread
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Table t1= new Table();
		t1.printtable(6);
	}
}
