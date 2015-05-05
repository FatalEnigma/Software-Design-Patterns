package domain;

public abstract class AbstractProcessor implements Processor {
    private String speed;
    private boolean multicore;
 
    public AbstractProcessor(String s, boolean multi) {
        this.speed = s;
        this.multicore = multi;
    }
    @Override
	public String getSpeed() {
        return speed;
    }
 
    @Override
	public boolean isMultiCore() {
        return multicore;
    }
 
    @Override
	public String toString() {
        return getClass().getSimpleName() + " (" + speed + ")";
    }
}
