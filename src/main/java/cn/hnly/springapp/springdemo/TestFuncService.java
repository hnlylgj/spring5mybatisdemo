package cn.hnly.springapp.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hnly.mysql.TestMybatis.User;

@Component
public class TestFuncService 
{

	    final private ITestFunc service;

	    @Autowired
	    public TestFuncService(ITestFunc service) 
	    {
	        this.service = service;//构造注入
	    }

	  	    
	    public void OutMessage(String Str)
	    {
	        this.service.OutMessage(Str);;
	    }
	    public String GetMessage(int IndeX) 
	    {
	    	
	    	return this.service.GetMessage(IndeX);
	    }
	    
	    public User GetUser(int id) 
	    {
	    	
	    	return this.service.GetUser(id);
	    }
	    
	
}
