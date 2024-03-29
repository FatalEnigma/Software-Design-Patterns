package lab2_singleton;

public class Application {

	public static void main(String[] args) {
		SensorController sc;
	    ISensorFactory factory = null;	
		int choice = 2;	   
		
		try {
	        choice = Integer.parseInt(args[0]);
	    } catch (NumberFormatException e) {
	        System.err.println("Argument must be an integer");
	        System.exit(1);
	    }
		
	    if(choice==1){
	    	factory = new WiredSensorFactory();}
	    else{
	    	factory = WirelessSensorFactory.getWirelessFactory();} //singleton version
	    
    	sc = new SensorController(factory);
	    sc.start();
	    
	}

}
