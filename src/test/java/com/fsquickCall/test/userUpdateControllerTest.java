package com.fsquickCall.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;  
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;  

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fsquickCall.model.User;

@RunWith(SpringJUnit4ClassRunner.class)    
@WebAppConfiguration    
@ContextConfiguration(locations = {"classpath:fsquickCall-springMVC.xml","classpath:fsquickCall-applicationContext.xml"})

public class userUpdateControllerTest {			
	
	    @Autowired    
	    private WebApplicationContext wac;    
	    private MockMvc mockMvc;   
	    
	      
	    @Before    
	    public void setup() {     
	    	mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();	        	        
	    }   
	      
	    @Test    
	    public void testUsersave() throws Exception { 
	    	this.mockMvc.perform(post("/user/userSave").param("id","2").param("loginid","pdx").param("name","pdx").param("phone","18716318198").param("planid","prod.75700001090467").param("plan","4G").param("note","")  
	    	        ).andExpect(status().isOk()).andDo(print());	    	    	    	 
	    	    	    
	    }   
	      	   
}
