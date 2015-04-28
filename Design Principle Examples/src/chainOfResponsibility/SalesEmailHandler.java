package chainOfResponsibility;

public class SalesEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] matchingWords() {
		// TODO Auto-generated method stub
		return new String[] { "Sales", "Buy" };
	}

	@Override
	protected void handlerHere(String email) {
		// TODO Auto-generated method stub
		System.out.println("This is a sales email");
	}

}
