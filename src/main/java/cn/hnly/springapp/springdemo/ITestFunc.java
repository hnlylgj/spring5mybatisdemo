package cn.hnly.springapp.springdemo;

import com.hnly.mysql.TestMybatis.User;

public interface ITestFunc 
{

	void OutMessage(String Str);
	
	String GetMessage(int IndeX);
	
	User GetUser(int id);
}
