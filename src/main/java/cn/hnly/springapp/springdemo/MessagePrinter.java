package cn.hnly.springapp.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter
{

    final private IMessageService service;

    @Autowired
    public MessagePrinter(IMessageService service) 
    {
        this.service = service;//构造注入
    }

    public void printMessage()
    {
        System.out.println(this.service.getMessage());
    }
    
    public void OutMessage(String Str)
    {
        this.service.OutMessage(Str);;
    }
    
    
}