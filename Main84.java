 class Gap implements Runnable
{
    public void run()
    {
        System.out.println("Hello World");
    }
}
class Main84
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Thread tt= new Thread(new Gap());
		tt.start();
	}
}
