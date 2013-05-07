
public class WantMilk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ChocolateBoiler myChocolateBoiler = new ChocolateBoiler();
		ChocolateBoiler myChocolateBoiler2 = new ChocolateBoiler();
		
		
		
		System.out.println("FIRST INSTANCE STARTS");
		System.out.println("Initial Status:");
		myChocolateBoiler.printStatus();
		System.out.println("FIRST INSTANCE ENDS");
		
		System.out.println("SECOND INSTANCE STARTS");
		System.out.println("Initial Status:");
		myChocolateBoiler2.printStatus();
		System.out.println("We are going to fill.");
		myChocolateBoiler2.fill();
		System.out.println("SECOND INSTANCE ENDS");
		
		
		System.out.println("FIRST INSTANCE STARTS");
		System.out.println("We are going to fill.");
		myChocolateBoiler.fill();
		System.out.println("After filling Status:");
		System.out.println("FIRST INSTANCE ENDS");
		
		System.out.println("SECOND INSTANCE STARTS");
		System.out.println("After filling Status:");
		myChocolateBoiler2.printStatus();
		System.out.println("We are going to boil.");
		System.out.println("SECOND INSTANCE ENDS");
		
		
		System.out.println("SECOND INSTANCE STARTS");
		myChocolateBoiler2.boil();
		System.out.println("After boiling Status:");
		myChocolateBoiler2.printStatus();
		System.out.println("SECOND INSTANCE ENDS");
		
		System.out.println("FIRST INSTANCE STARTS");
		myChocolateBoiler.printStatus();
		System.out.println("FIRST INSTANCE ENDS");
		
		
		System.out.println("FIRST INSTANCE STARTS");
		System.out.println("We are going to boil.");
		myChocolateBoiler.boil();
		System.out.println("After boiling Status:");
		System.out.println("FIRST INSTANCE ENDS");
		
		System.out.println("SECOND INSTANCE STARTS");
		System.out.println("We are going to drain.");
		myChocolateBoiler2.drain();
		System.out.println("After boiling Status:");
		System.out.println("SECOND INSTANCE ENDS");
		
		
		System.out.println("FIRST INSTANCE STARTS");
		myChocolateBoiler.printStatus();
		System.out.println("FIRST INSTANCE ENDS");
		
		System.out.println("FIRST INSTANCE STARTS");
		myChocolateBoiler.printStatus();
		System.out.println("We are going to drain.");
		myChocolateBoiler.drain();
		System.out.println("After boiling Status:");
		System.out.println("FIRST INSTANCE ENDS");

		
		System.out.println("SECOND INSTANCE STARTS");
		myChocolateBoiler2.printStatus();
		System.out.println("SECOND INSTANCE ENDS");
		
		
		
	}

}
