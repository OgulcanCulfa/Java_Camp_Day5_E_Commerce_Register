package e_commerce_register.core;

public class EmailLogger implements LoggerService {

	@Override
	public void log() {
		System.out.println("Doğrulama e-maili gönderildi.");
	}

}
