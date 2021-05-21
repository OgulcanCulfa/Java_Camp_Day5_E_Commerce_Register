package e_commerce_register.dataAccess.abstracts;

import java.util.List;

import e_commerce_register.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void update(User user);
	void delete(User user);
	void login(User user);
	User get(int id);
	List<User> getAll();
}
