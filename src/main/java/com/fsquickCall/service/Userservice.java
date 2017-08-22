package com.fsquickCall.service;

import java.util.List;

import com.fsquickCall.model.User;

public interface Userservice {

	 
    public List<User> usersList();  
    
    public List<User> usersListByPage(int start,int end);  
     
    public void addUser(User user);  
       
}
