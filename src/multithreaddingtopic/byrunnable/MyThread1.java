package multithreaddingtopic.byrunnable;

public class MyThread1 implements Runnable
{
	@Override
	public void run() 
	{
		for (int i = 1; i <=5; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(i+"---" + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		
		Thread  t1 = new Thread(th1);
		Thread  t2 = new Thread(th2);
		
		t1.start();
		t2.start();
	}
}
