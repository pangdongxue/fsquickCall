package com.fsquickCall.service;

import java.util.List;

import com.fsquickCall.model.User;

public interface Userservice {

	 
    public List<User> usersList();  
    
    public List<User> usersListByPage(int start,int end);  
     
    public int addUser(User user);  
    
    public int updateUser(User user);
    
    public int deleteUserById(int id);
    
    public List<User> getAllUsers(int page, int rows, String name, String phone);
    
    public int getCount(String name, String phone);
       
}
