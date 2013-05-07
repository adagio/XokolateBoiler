
public class WantMilk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChocolateBoiler myChocolateBoiler = new ChocolateBoiler();
		
		System.out.println("Initial Status:");
		myChocolateBoiler.printStatus();
		System.out.println("We are going to fill.");
		myChocolateBoiler.fill();
		System.out.println("After filling Status:");
		myChocolateBoiler.printStatus();
		
		System.out.println("We are going to boil.");
		myChocolateBoiler.boil();
		System.out.println("After boiling Status:");
		myChocolateBoiler.printStatus();
		
		System.out.println("We are going to drain.");
		myChocolateBoiler.drain();
		System.out.println("After boiling Status:");
		myChocolateBoiler.printStatus();
		
	}

}
