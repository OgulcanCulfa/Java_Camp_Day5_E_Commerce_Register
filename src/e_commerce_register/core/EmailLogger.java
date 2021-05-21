package e_commerce_register.core;

public class EmailLogger implements LoggerService {

	@Override
	public void log() {
		System.out.println("Doðrulama e-maili gönderildi.");
	}

}
