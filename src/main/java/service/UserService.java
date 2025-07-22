package service;

import java.util.List;

import model.User;

public interface UserService {
	List<User> findAllUsers();
	User getUserById(Integer id);
	User getUserByUsername(String name);
	void addUser(String username, String password);
	void changePasswordById(Integer id, String oldpassword, String password);
	void deleteUserById(Integer id);
	
	// 登入
	boolean login(String username, String password);
}
