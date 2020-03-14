package com.cts.traning.userservice;

import java.util.List;

public interface UserService {
	public UserDTO insert(UserDTO userDTO);
	public List<UserDTO> getAllUsers();
	public UserDTO getUserById(int id);
	
	public void deleteUser(int id);
	public UserDTO updateUser(UserDTO user);
	public boolean activateUser(String email);
	public UserDTO getUserByUsernameAndPassword(String username, String password);
}


