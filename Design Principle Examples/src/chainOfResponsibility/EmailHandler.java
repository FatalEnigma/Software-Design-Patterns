package chainOfResponsibility;

public interface EmailHandler {
	
	public void setNextHandler (EmailHandler emailHandler);
	public void processHandler (String email);

}
