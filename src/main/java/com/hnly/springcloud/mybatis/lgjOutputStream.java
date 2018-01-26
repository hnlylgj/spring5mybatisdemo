package com.hnly.springcloud.mybatis;

import java.io.IOException;
import java.io.OutputStream;

public class lgjOutputStream extends OutputStream
{
	lgjEventManager MylgjEventManager=null;
	
	public lgjOutputStream()
	{
		 
	}
		
	public lgjOutputStream(lgjEventManager InlgjEventManager)
	{
		MylgjEventManager= InlgjEventManager;
	}
	
	 @Override
	 public void write(int b) throws IOException
	 {
		 
		 
		 
		 
		 
	 }
	  @Override
	 public void write(byte b[]) throws IOException 
	 {
	        write(b, 0, b.length);
     }
	  
	  @Override
	 public void write(byte b[], int off, int len) throws IOException
	 {
	        //数组不能为空，否则抛出NullPointerException
	        if (b == null) 
	        {
	            throw new NullPointerException();
	        } 
	        else if ((off < 0) || (off > b.length) || (len < 0) ||
	                   ((off + len) > b.length) || ((off + len) < 0))
	        {
	              //此处判断off+len<0是多余的
	              throw new IndexOutOfBoundsException();
	        } 
	        else if (len == 0) 
	        {
	            return;
	        }
	        //最终会调用第一个write方法。注意：1.子类可能会复写当前的write方法；2.在输出的过程中，还是一个一个字节输出的。
	       
	       // for (int i = 0 ; i < len ; i++) 
	       // {
	       //    write(b[off + i]);
	       // }
	        
	        lgjwrite(b, off, len);
	        
	    }
       
	 
	 private void lgjwrite(byte b[], int off, int len) throws IOException
	 {
	       
		 //String.valueOf(len);//
		  String MessageStr=new  String(b);		 
			  
		  if(MylgjEventManager!=null)
	      {
			 lgjEventObject MylgjEventObject=new lgjEventObject(this,null); 
	         MylgjEventObject.ResultCode=100; 
	         MylgjEventObject.ResultStr= MessageStr; 
	       
	         MylgjEventManager.FireWorkspaceHandle(MylgjEventObject);  
	      }	
		 
	}
	
}
