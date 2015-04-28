package chainOfResponsibility;

public abstract class AbstractEmailHandler implements EmailHandler {
	
	private EmailHandler nextHandler;

	@Override
	public void setNextHandler(EmailHandler emailHandler) {
		// TODO Auto-generated method stub
		nextHandler = emailHandler;
	}

	@Override
	public void processHandler(String email) {
		// TODO Auto-generated method stub
		boolean wordFound = false;
		
		if (matchingWords().length == 0) {
			wordFound = true;
		}
		else {
			for (String word : matchingWords()) {
				if (email.indexOf(word.toLowerCase()) >= 0) {
					wordFound = true;
					break;
				}
			}
		}
		if (wordFound) {
			handlerHere(email);
		}
		else {
			nextHandler.processHandler(email);
		}
	}
	
	protected abstract String[] matchingWords();
	protected abstract void handlerHere(String email);

}
