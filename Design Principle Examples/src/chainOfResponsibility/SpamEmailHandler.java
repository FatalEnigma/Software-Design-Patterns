package chainOfResponsibility;

public class SpamEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] matchingWords() {
		// TODO Auto-generated method stub
		return new String[] { "viagra", "pills" };
	}

	@Override
	protected void handlerHere(String email) {
		// TODO Auto-generated method stub
		System.out.println("This is a spam email");
	}
}
