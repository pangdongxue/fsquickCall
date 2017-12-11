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




@RunWith(SpringJUnit4ClassRunner.class)    
@WebAppConfiguration    
@ContextConfiguration(locations = {"classpath:fsquickCall-springMVC.xml","classpath:fsquickCall-applicationContext.xml"})

public class userDeleteControllerTest {			
	
	    @Autowired    
	    private WebApplicationContext wac;    
	    private MockMvc mockMvc;   
	    
	      
	    @Before    
	    public void setup() {     
	    	mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();	        	        
	    }   
	      
	    @Test    
	    public void testUserdelete() throws Exception { 
	    	
	    	this.mockMvc.perform(post("/user/userDelete").param("delIds","1") 
	    	        ).andExpect(status().isOk()).andDo(print());	    	    	    	 
	    	    	    
	    }   
	      	   
}
