
// import java.util.logging.Level;
import java.util.logging.Logger;

public class ChocolateBoiler {
	
	private boolean empty;
	private boolean boiled;
	
	private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
	
	private static Logger LOGGER = Logger.getLogger(ChocolateBoiler.class.getName());
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
		
	    // LOGGER.setLevel(Level.WARNING);
	}
	
	public static ChocolateBoiler getInstance() {
		return uniqueInstance;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture 
			System.out.println("Chocolate boiler: filling the boiler");
		} else {
			System.out.println("Chocolate boiler: couldn't fill. was not empty");
			LOGGER.warning("Chocolate boiler: couldn't fill. was not empty");
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			System.out.println("Chocolate boiler: draining the boiler");
			empty = true;
		} else if (isEmpty()) {
			System.out.println("Chocolate boiler: couldn't drain. was empty");
			LOGGER.warning("Chocolate boiler: couldn't drain. was empty");
		} else {
			System.out.println("Chocolate boiler: couldn't drain. was not boiled");
			LOGGER.warning("Chocolate boiler: couldn't drain. was empty");
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			System.out.println("Chocolate boiler: boiling");
			boiled = true;
		} else if (isEmpty()) {
			System.out.println("Chocolate boiler: couldn't boil. was empty");
			LOGGER.warning("Chocolate boiler: couldn't boil. was empty");
		} else {
			System.out.println("Chocolate boiler: couldn't boil. was already boiled");
			LOGGER.warning("Chocolate boiler: couldn't boil. was already boiled");
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
