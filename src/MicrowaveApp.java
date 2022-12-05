public class MicrowaveApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("First commit");
		System.out.println("second commit");
		System.out.println("Third commit");
		
//		// This is the first Object (microwave1) for the Microwave Class being created. 
//		Microwave microwave1 = new Microwave();
//		
//		microwave1.printData();
//		
//		// Creating the second Object for the Microwave.
//		Microwave microwave2 = new Microwave("Silvercrest");
//		microwave2.printData();
//		
//		// Creating the 3rd Object for the Microwave 
//		Microwave microwave3 = new Microwave ("LG", 9);
//		microwave3.printData();
//		
//		
//		//Change value 
//		Microwave microwave4 = new Microwave();
//		microwave4.changeValue("Kenwood", 5);
//		
//		
//		microwave1.changeValue("TeaPot2.0", 100);
		
		
		// Create new Object using electric kettle 
		ElectricKettle electricKettle = new ElectricKettle();
		
		electricKettle.changeValue("SaucePan", 500);
		electricKettle.changeLight();
		electricKettle.engage();
	} // END OF MAIN MICROWAVE APP
	
	
}



