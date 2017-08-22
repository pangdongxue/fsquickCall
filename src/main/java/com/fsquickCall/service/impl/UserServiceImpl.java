package com.fsquickCall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsquickCall.dao.UserDao;
import com.fsquickCall.model.User;
import com.fsquickCall.service.Userservice;

@Service("Userservice")
public class UserServiceImpl implements Userservice{

	@Autowired
	private UserDao userDao;
	
	public List<User> usersList(){
		return userDao.usersList();
	}
    
    public List<User> usersListByPage(int start,int end){
    	return userDao.usersListByPage(start, end);
    }
    	
     
    public void addUser(User user){
    	userDao.addUser(user);
    }
       
}
