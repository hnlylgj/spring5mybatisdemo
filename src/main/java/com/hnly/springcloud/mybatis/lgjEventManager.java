package com.hnly.springcloud.mybatis;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class lgjEventManager 
{
	 private Collection lgjEventListenerSet;
	 private int  MyMessageEventMAPID;
	 
	     /**
	     * 添加事件
	     * 
	     * @param listener	    
	     */
	    public void AddListener(lgjEventListener OneEventlistener)
	    {
	        if (lgjEventListenerSet == null)
	        {
	        	lgjEventListenerSet = new HashSet();
	        }
	        lgjEventListenerSet.add(OneEventlistener);
	    }

	    /**
	     * 移除事件
	     * 
	     * @param listener*    
	     */
	    public void RemoveListener(lgjEventListener OneEventlistener)
	    {
	        if (lgjEventListenerSet == null)return;	        
	        lgjEventListenerSet.remove(OneEventlistener);
	    }

	    /**
	     * 触发事件:1
	     */
	    public void FireWorkspaceHandle(int ResultCode,String InMessageStr) 
	    {
	        if (lgjEventListenerSet == null)return;
	        
	        lgjEventObject event = new lgjEventObject(this, null);
	        event.ResultCode=ResultCode;
	        event.ResultStr=InMessageStr;
	       //MyMessageEventMAPID=MessageEventMAP.LogFlag;
	        
	        StartNotifyListeners(event);
	    }
	    
	    /**
	     * 触发事件:2
	     */
	    public void FireWorkspaceHandle(lgjEventObject event ) 
	    {
	        if (lgjEventListenerSet== null)return;
	       
	        //MyMessageEventMAPID=MessageEventMAP.LogFlag;
	       
	        StartNotifyListeners(event);
	    }
       

	    /**
	     * 通知所有的Listener
	     */
	    private void StartNotifyListeners(lgjEventObject event) 
	    {
	        Iterator iter = lgjEventListenerSet.iterator();
	        while (iter.hasNext())
	        {
	        	lgjEventListener listener = (lgjEventListener) iter.next();
	        	listener.OutMessageEvent(event);
	        	
	        	//if(MyMessageEventMAPID==MessageEventMAP.LogFlag)
	        	//{
	            //   
	        	//}
	        	        	
	        	
	        }
	    }
	
}
