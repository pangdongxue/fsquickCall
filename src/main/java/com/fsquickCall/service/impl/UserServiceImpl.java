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
    	
     
    public int addUser(User user){
    	return userDao.addUser(user);
    }
       
    public int updateUser(User user){
    	return userDao.updateUser(user);
    }
    
    public int deleteUserById(int id){
    	return userDao.deleteUserById(id);
    }

	
	public List<User> getAllUsers(int page, int rows, String name, String phone) {
		return userDao.getAllUsers(page, rows, "%"+name+"%", "%"+phone+"%");
	}

	
	public int getCount(String name, String phone) {		
		return userDao.getCount("%"+name+"%", "%"+phone+"%");
	}
}
