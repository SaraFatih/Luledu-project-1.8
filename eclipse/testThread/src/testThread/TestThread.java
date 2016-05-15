package testThread;

public class TestThread implements Runnable{
	
	private int number;
	public synchronized int getNumber() {
		return number;
	}

	public synchronized void  setNumber(int number) {
		System.out.println("I am changing the number"+this.getNumber());
		this.number = number;
	}

	public TestThread(int number){
		this.number=number;
		
	}
	
	public void run() {
        // compute primes larger than minPrime
		System.out.println("My number: "+this.number);
		this.setNumber(this.getNumber()+1);
		
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread one = new TestThread(1);
		TestThread two = new TestThread(2);
		TestThread three = new TestThread(3);
		
		new Thread(one).start();
		new Thread(two).start();
		new Thread(three).start();
	}

}
