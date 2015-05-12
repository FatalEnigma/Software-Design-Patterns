package domain;

import java.io.*;
public interface Processor extends Serializable {
    public String getSpeed();
    public boolean isMultiCore();
}
