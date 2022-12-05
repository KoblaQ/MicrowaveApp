//PS: Add public only when it is in another class file. If it is embedded in the same main class, just start with the class. 
public class Microwave {
	
	//These are the Attributes
	protected String brand;
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	protected boolean isOn;
	protected boolean isTooHigh;
	protected boolean isTooLow;
	protected int temperature;
	
	
	//CONSTRUCTORS
	// Default constructor because it has no parameters
	public Microwave() {
		brand = "";
		isOn = false;
	}
	
	// Second Parameterized constructor.
	public Microwave(String brandName)
	{
		isOn = true; 
		brand = brandName;
	}
	
	// Third Parameterized constructor
	public Microwave(String brandName, int heatLevel)
	{
		isOn = true;
		brand = brandName;	
		isTooHigh = true;
		this.temperature = heatLevel;
	}
	
	// These are the Methods of the Microwave class
	//Method 1 (start) 
	public void start() {
	//	isOn = true;
		System.out.print("Microwave turns On");
	}
	
	//Method 2 (stop) 
	public void stop() {
	//	isOn = false; 

		System.out.print("Microwave turns Off");
	}
	
	// Method 3 (Print Data)
	public void printData() {
		System.out.println("Microwave");
		System.out.println("Brand: " + brand);
		if(isOn == true) {
			System.out.println("Microwave is On");
		} else {
			System.out.println("Microwave is Off");
		}
		
		if (isTooHigh = true) {
			System.out.println("Reduce the Heat Level");
		} else {
			System.out.println("Heat Level not yet high");
		}
	}
	
	// Change value method
	
	public void changeValue(String brandName, int heatLevel) {
		brand = brandName;
		temperature = heatLevel;
		
		System.out.println("Change of Values");
		System.out.println("Brand is now changed to: " + brand);
		System.out.println("Heat Level is now: " + temperature);
	}
	
	
} // End of Microwave Class

//NEW INHERIT CLASS
class ElectricKettle extends Microwave {
	private String brand = "Charcoal";
	
	// Sub Class Method
	public void changeLight() {
		System.out.println("Kettle Led light just changed colors");
	}
	
	public void engage() {
		super.start();
	}
	
} // End of Kettle class
