package e_commerce_register.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import e_commerce_register.business.abstracts.UserService;
import e_commerce_register.core.LoggerService;
import e_commerce_register.dataAccess.abstracts.UserDao;
import e_commerce_register.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private LoggerService loggerService;

	public UserManager(UserDao userDao, LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.loggerService = loggerService;
	}

	@Override
	public void register(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Parolanýz 6 harften büyük olmalýdýr.");
			
		} else {
			String regex = "^(.+)@(.+)$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(user.getEmail());
			if (!matcher.matches()) {
				System.out.println("Lütfen geçerli bir e-posta adresi giriniz.");
			} else {
				if (user.getFirstName().length() <= 2 || user.getLastName().length() <= 2) {
					System.out.println("Ad ve soyad 2 harften küçük olamaz.");
				} else {
					this.userDao.register(user);
					this.loggerService.log();
					System.out.println("Doðrulamak için linke týklayýn: " + "www.ornekbirlink.com");
				}
			}
		}
		
	}

	@Override
	public List<User> getAll() {
		return null;
	}

	@Override
	public void login(User user) {
		if (user.getEmail() == null || user.getPassword() == null) {
			System.out.println("E-posta ve parola girilmesi zorunludur.");
		} else {
			System.out.println("Baþarýlý bir þekilde giriþ yaptýnýz.");
		}
		
	}

}
