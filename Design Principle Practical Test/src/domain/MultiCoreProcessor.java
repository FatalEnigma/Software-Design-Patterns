package domain;

public class MultiCoreProcessor extends AbstractProcessor {
    public MultiCoreProcessor(String speed) {
        super(speed, true); // multicore
    }
}
