package threadprograms;

public class MyThread extends Thread {
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Currently executing Thread: "+getName());
	}
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("Kavya");
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("Ramya");
		t2.start();
	}

}
