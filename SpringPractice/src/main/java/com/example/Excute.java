package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nontarget.BeanConfigClass;

public class Excute{

public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
	BeanConfigClass configClass = context.getBean(BeanConfigClass.class);
	configClass.print();
	
	System.out.println("==================");
	
	BeanScanClass beanScan = context.getBean(BeanScanClass.class);
	beanScan.print();
}

}
