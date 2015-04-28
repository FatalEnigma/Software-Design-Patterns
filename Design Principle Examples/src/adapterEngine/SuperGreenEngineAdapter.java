package adapterEngine;

public class SuperGreenEngineAdapter extends AbstractEngine {
    public SuperGreenEngineAdapter(SuperGreenEngine greenEngine){     
        super(greenEngine.getEngineSize(), false);
   }
}
