
public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	
	public ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture 
			System.out.println("Chocolate boiler: filling the boiler");
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			System.out.println("Chocolate boiler: draining the boiler");
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			System.out.println("Chocolate boiler: boiling");
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
	public void printStatus() {
		if (isEmpty()) {
			System.out.println("Chocolate boiler: empty");
		} else {
			System.out.println("Chocolate boiler: not empty");
		}
			
		if (isBoiled()) {
			System.out.println("Chocolate boiler: boiled");
		} else {
			System.out.println("Chocolate boiler: not boiled");
		}
	}
	
}