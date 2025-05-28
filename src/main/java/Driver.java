import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new CounterStrike();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
