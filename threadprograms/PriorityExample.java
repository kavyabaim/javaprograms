package threadprograms;

public class PriorityExample extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityExample t1 = new PriorityExample();
		PriorityExample t2 = new PriorityExample();
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t1.setPriority(MIN_PRIORITY);
		t1.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();		

	}
	
	public void run() {
		System.out.println("Thread Name : "+getName()+" Thread Priority : "+getPriority());
	}

}
