package com.cmz.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmz.CheckingAccountService;

public class Client {
public static void main(String[] args) throws Exception { ApplicationContext ctx = new ClassPathXmlApplicationContext(
new String[]{"com/cmz/client.xml","com/cmz/jms.xml"});
		CheckingAccountService service = (CheckingAccountService) ctx
		.getBean("checkingAccountService");service.cancelAccount(new Long(10));


}}


