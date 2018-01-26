package com.hnly.springcloud.mybatis;

public class MessageEventMAP
{
	  public static final int RegisterAccount =1000;      
      public static final int UpdatePassWord =1001; 
      public static final int LoginCloud=1002;
      public static final int GetAccount=1003;        
      public static final int SetAccount=1004;      
      public static final int EditAccount=1005;
    
    //------------------------------------------
      
      public static final int CreateDevice=2000;
      public static final int MadeDevice=2001;  
      public static final int SaleDevice=2002;
      public static final int BindingDevice=2003;       
      public static final int GetDevice=2004;
      //------------------------------------------
      
      public static final int  SendSmartWarn=3000;  
      public static final int  PostListSmartWarn=3001;       
      public static final int  GetSmartWarn=3002;  
      public static final int  TotalSmartWarn=3003;  
     //---------------------------------------------
      
      public static final int  SendCarRunState=4000;  
      public static final int  PostListCarRunState=4001;
      public static final int  GetCarRunState=4002;  
      
      //---------------------------------------------
      public static final int VispectCloudManager=8000;
      public static final int VispectCloudAdapter=8001;
      public static final int PostListSyncData=8002;  
      
      public static final int LogFlag=65535;  
}
