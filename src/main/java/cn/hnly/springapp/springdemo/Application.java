package cn.hnly.springapp.springdemo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import com.hnly.mysql.TestMybatis.User;

@Configuration
@ComponentScan
public class Application 
{
	public static SqlSessionFactory MysqlSessionFactory;
	
	public Application() 
	{
		//MybatisInit(); 
		
	}
	public void MybatisInit() 
    { 
    	
    	String resource = "com/hnly/mysql/TestMybatis/mybatis-config.xml";
    	InputStream inputStream=null;
		try
		{
			inputStream = Resources.getResourceAsStream(resource);
			System.out.println( "MybatisInit:OK!" );
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	MysqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    	
    }  
	
	 
    @Bean
    IMessageService mockMessageService() 
    {
        return new IMessageService()//匿名类
        {
            public String getMessage() 
            {
              return "Hello World!";
            }
            
            public void OutMessage(String Str)
            {
            	 System.out.println(Str);
            }
            
        };
    }
    
    
    @Bean
    ITestFunc mockTestFuncService() 
    {
        return new ITestFunc()//匿名类
        {
                      
            public void OutMessage(String Str)
            {
            	 System.out.println(Str);
            }
            
            public String GetMessage(int IndeX)
            {        	
            	
            	
            	return "中国人,ligengjun";
            	
            }
            
            public User GetUser(int id)
            {        	
            	
            	SqlSession session = MysqlSessionFactory.openSession();
            	User user=null;
            	try
            	{
            	 
            		user = (User) session.selectOne("com.hnly.mysql.TestMybatis.userMapper.getUser", 2);
           	
            	  
            	}
            	finally
            	{
            	  session.close();
            	}
            	return user;
            	
            }
            
        };
    }
    
    
}
