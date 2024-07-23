package multithreaddingtopic.bythread;

public class MyThread1 extends Thread
{
	@Override
	public void run() 
	{
//		System.out.println("Hi I am Thread : " + Thread.currentThread().getName());
		if (Thread.currentThread().isDaemon()) 
		{
			System.out.println("Hi I am Daemon : " + Thread.currentThread().getName());
		} else 
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
				System.out.println(i+"----"+Thread.currentThread().getName());
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hi I am in Main method : " + Thread.currentThread().getName());
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		MyThread1 th3 = new MyThread1();

		
//		try 
//		{
//			th1.join();
//		} catch (InterruptedException e) 
//		{
//			e.printStackTrace();
//		}
//		
		
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.MIN_PRIORITY);
		th3.setPriority(Thread.NORM_PRIORITY);
		
		
		th1.setName("C Language");
		th2.setName("C++ Language");
		th3.setName("JAVA Language");
		
		
		th1.setDaemon(true);
		
		
		th1.start();// th1--thread---callstack---indpendetly execution
		th2.start();// th2--thread---callstack---indpendetly execution
		th3.start();// th2--thread---callstack---indpendetly execution
	}
}