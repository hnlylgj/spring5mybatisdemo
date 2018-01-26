package com.hnly.springcloud.mybatis;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Hello world!
 *
 */
public class DeskApp 
{
    public static void xxxmain( String[] args )
    {
            
       
    	       try
    	       {  
    	            PrintStream Oldout = System.out;  
    	            PrintStream ps = new PrintStream("d:/lgjlog2017.txt");  

    	            System.setOut(ps);  
    	            int age = 11;  
    	            System.out.println("年龄变量成功定义，初始值为11");  
    	            String sex = "女";  
    	            System.out.println("年龄变量成功定义，初始值为女");  
    	            // 整合2个变量  
    	            String info = "这是个" + sex + "孩子，应该有" + age + "岁了";  
    	            System.setOut(Oldout);  
    	            System.out.println("程序运行完毕，请查看日志");  
    	        }
    	      catch (FileNotFoundException e)
    	      {  
    	            e.printStackTrace();  
    	       }  

    	
    }
}
