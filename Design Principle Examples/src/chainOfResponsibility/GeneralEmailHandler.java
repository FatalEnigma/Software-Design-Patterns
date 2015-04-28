package chainOfResponsibility;

public class GeneralEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] matchingWords() {
		// TODO Auto-generated method stub
		return new String[0];
	}

	@Override
	protected void handlerHere(String email) {
		// TODO Auto-generated method stub
		System.out.println("Email handled by general enquiries");
	}

}
