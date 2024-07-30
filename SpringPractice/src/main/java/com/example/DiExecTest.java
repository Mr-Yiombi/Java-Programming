package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class DiExecTest{
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //AppConfig를 기준으로 컨테이너를 만들겠다.
		
		ExecClass execClass = context.getBean(ExecClass.class);
		execClass.getExecDi();
	
		
		((ConfigurableApplicationContext) context).close();
		
	}
	
}
