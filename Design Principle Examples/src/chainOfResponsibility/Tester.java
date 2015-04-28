package chainOfResponsibility;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailHandler spam = new SpamEmailHandler();
		EmailHandler sales = new SalesEmailHandler();
		EmailHandler general = new GeneralEmailHandler();
		
		spam.setNextHandler(sales);
		sales.setNextHandler(general);
		
		spam.processHandler("This is a test email which has a bit of buy in it");
	}

}
