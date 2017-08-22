package com.fsquickCall.dao;

import java.util.List;

import com.fsquickCall.model.User;


public interface UserDao {  
      
    /** 
     * 查询所有客户，显示列表 
     */  
    public List<User> usersList();  
    /** 
     * 根据页数和记录数，返回记录 
     */  
    public List<User> usersListByPage(int start,int end);  
    /** 
     * 添加客户 
     */  
    public void addUser(User user);  
    
}
