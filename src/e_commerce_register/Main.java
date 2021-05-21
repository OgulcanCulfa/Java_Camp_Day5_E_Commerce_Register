package e_commerce_register;



import e_commerce_register.business.abstracts.UserService;
import e_commerce_register.business.concretes.UserManager;
import e_commerce_register.core.EmailLogger;
import e_commerce_register.dataAccess.concretes.GoogleUserRegisterDao;
import e_commerce_register.dataAccess.concretes.NormalUserRegisterDao;
import e_commerce_register.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		UserService userServiceNormal = new UserManager(new NormalUserRegisterDao(),new EmailLogger());
		UserService userServiceGoogle = new UserManager(new GoogleUserRegisterDao(),new EmailLogger());
		
		User user = new User(1,"Oðulcan","Culfa","ogulcanculfa@gmail.com","123456789");
		
		
		userServiceNormal.register(user);
		userServiceGoogle.register(user);
	}
}
