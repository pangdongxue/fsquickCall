package com.fsquickCall.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.fsquickCall.model.User;
import com.fsquickCall.service.Userservice;


@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:fsquickCall-applicationContext.xml","classpath:fsquickCall-mybatis.xml"})
@Transactional        
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)

public class userTest {
	
	private static final Logger logger = Logger.getLogger(userTest.class);
	private Userservice userservice;
	
	public Userservice getUserService() {
		return userservice;
	}

	@Autowired
	public void setUserService(Userservice userservice) {
		this.userservice = userservice;
	}

	@Test
	//@Transactional   //标明此方法需使用事务    
	//@Rollback(true)
	public void userAdd(){
		User user = new User();
		user.setName("pangdongxue");
	    user.setPhone("18716318198");
	    user.setPlan("4G飞享套餐");
	    user.setNote("成功了");
	    userservice.addUser(user);
	    
	    List<User> userslist = userservice.usersList();
	    logger.info(JSON.toJSONStringWithDateFormat(userslist, ""));
	}
	
}
