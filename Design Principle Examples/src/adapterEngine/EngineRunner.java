package adapterEngine;

import java.util.ArrayList;
import java.util.List;

public class EngineRunner {

	public static void main(String[] args) {

		List<Engine> engines = new ArrayList<Engine>();
		 
		engines.add(new StandardEngine(1300));
		engines.add(new StandardEngine(1600));
		engines.add(new TurboEngine(2000));
		
		SuperGreenEngine superG = new SuperGreenEngine(1200);
		SuperGreenEngineAdapter superGAdapter = new SuperGreenEngineAdapter(superG);
		 
		engines.add(superGAdapter);
		
		for (Engine engine : engines) {
		    System.out.println(engine);
		}

		}


	}
