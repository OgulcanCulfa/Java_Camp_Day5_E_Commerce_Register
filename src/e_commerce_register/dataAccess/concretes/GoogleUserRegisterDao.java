package e_commerce_register.dataAccess.concretes;

import java.util.List;

import e_commerce_register.dataAccess.abstracts.UserDao;
import e_commerce_register.entities.concretes.User;

public class GoogleUserRegisterDao implements UserDao {

	@Override
	public void register(User user) {
		System.out.println("Kullanýcý Google kayýt yoluyla sisteme eklendi. Ýsim: " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(User user) {
		System.out.println("Giriþ yapýldý. Ýsim: " + user.getFirstName());	
	}

}
