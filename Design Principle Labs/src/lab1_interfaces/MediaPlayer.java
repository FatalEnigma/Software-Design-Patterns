package lab1_interfaces;


public class MediaPlayer {

	public static void main(String[] args) {
		String mediaClassName = "lab1." + args[0];
		
		IfVersion(mediaClassName);
		NoIfVersion(mediaClassName);
	}
	
	public static void IfVersion(String type) {
		IMedia m = new Mp3();
		
		if (type.equals("lab1.Mp3")) {
			m = new Mp3();
		}
		else if (type.equals("lab1.Avi")) {
			m = new Avi();
		}
		m.play();
	}
	
	public static void NoIfVersion(String type) {
		try {
			IMedia m = (IMedia) Class.forName(type).newInstance();
			m.play();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
