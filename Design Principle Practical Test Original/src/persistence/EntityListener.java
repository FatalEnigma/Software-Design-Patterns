package persistence;

import java.util.*;

public interface EntityListener {
    public void entityAdded(EntityEvent event);
    public void entityRestored(EntityEvent event);
}
