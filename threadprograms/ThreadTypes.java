package threadprograms;

public class ThreadTypes extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTypes t1 = new ThreadTypes();
		ThreadTypes t2 = new ThreadTypes();
		ThreadTypes t3 = new ThreadTypes();
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Functionality of Daemon Thread: "+getName());
		}
		else {
			System.out.println("Functionality of User Thread: "+getName());
		}
	}

}
