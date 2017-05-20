package com.my.dao;

import java.util.List;


import com.my.entity.User;

public interface UserMapper {
	
	public int add(User user);
	
	public User findById(int id);
	
	public List<User> findUsers();
}
