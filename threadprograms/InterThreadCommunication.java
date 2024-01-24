package threadprograms;

class Customer{
	private int balance = 10000;
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw Rs: "+amount);
		if(balance<amount) {
			System.out.println("Not enough balance in Account - Waiting For Deposit.........");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance = balance - amount;
		System.out.println("Amount Rs: "+amount+" Withdraw Balance : "+balance);
	}
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit Rs: "+amount);
		balance = balance + amount;
		System.out.println("Deposited Rs: "+amount+" Balance Rs: "+balance);
		notify();
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		new Thread("Kavya") {
			public void run() {
				customer.withdraw(16000);
			}
		}.start();
		
		new Thread("Priya") {
			public void run() {
				customer.deposit(25000);
			}
		}.start();

	}

}
