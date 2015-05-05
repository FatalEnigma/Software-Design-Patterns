package domain;

public class SingleCoreProcessor extends AbstractProcessor {
    public SingleCoreProcessor(String s) {
        super(s, false); // not multicore
    }
}