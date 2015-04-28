package lab4_factory_method;

public abstract class TelescopeFactory {
	
	protected abstract Telescope createTelescope (String type);
}
