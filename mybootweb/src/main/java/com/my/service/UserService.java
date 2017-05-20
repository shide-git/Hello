package com.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.my.dao.UserMapper;
import com.my.entity.User;

@Service
public class UserService {
	@Autowired
	public UserMapper userMapper;
	
	public List<User> findUsers(){
		return userMapper.findUsers();
	}
	
	@Transactional(readOnly=false)
	public int addUser(User user){
		return userMapper.add(user);
	}
}
