package lab4_simple_factory;

public class TelescopeSimpleFactory {
	
	public enum Type { ANYSKYPLUSTELESCOPE, ANYSKYTELESCOPE, ANYSUPERSKYTELESCOPE }
	
	public Telescope create(Type telescopeType) {
		if (telescopeType == Type.ANYSKYTELESCOPE) {
			return new AnySkyTelescope();
		}
		else if (telescopeType == Type.ANYSKYPLUSTELESCOPE) {
			return new AnySkyPlusTelescope();
		}
		else if (telescopeType == Type.ANYSUPERSKYTELESCOPE) {
			return new AnySuperSkyTelescope();
		}
		
		return null;
	}

}
