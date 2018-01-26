package com.hnly.springcloud.mybatis;

import java.util.EventObject;

public class lgjEventObject extends EventObject 
{
	private static final long serialVersionUID = 6996098798146410884L;	
	public int ResultCode =0;
	public String ResultStr = "";
	
	

    public lgjEventObject(Object source, String InResultStr)
    {
        super(source);
        this.ResultStr =InResultStr;
    }

    public void setResultStr(String InResultStr) 
    {
        this.ResultStr = InResultStr;
    }

    public String getResultStr()
   {
        return this.ResultStr;
    }

}
