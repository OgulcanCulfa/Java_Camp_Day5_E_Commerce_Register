package e_commerce_register.business.abstracts;

import java.util.List;

import e_commerce_register.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	List<User> getAll();
}
