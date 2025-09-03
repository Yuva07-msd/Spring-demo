package com.jspiders.springcore;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.dto.StudentDto;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/beans.xml");
		System.out.println("IoC CONTAINER CREATED!!!");
		System.out.println(context.getBean(StudentDto.class));
//		context=new FileSystemXmlApplicationContext("xml-file");
//		context=new AnnotationConfigApplicationContext("xml-file");
	}
}
