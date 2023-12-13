package com.imooc;

import com.imooc.aspect.OutSide;
import com.imooc.controller.HelloController;
import com.imooc.controller.HiController;
import com.imooc.controller.WelcomeController;
import com.imooc.dao.impl.Company;
import com.imooc.entity.User;
import com.imooc.entity.factory.UserFactoryBean;
import com.imooc.introduction.LittleUniverse;
import com.imooc.service.HelloService;
import com.imooc.service.HiService;
import com.imooc.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@Configuration
@EnableAspectJAutoProxy
@Import(OutSide.class)
@ComponentScan("com.imooc")
public class Entrance {

	public static void main(String[] args) {

//		String xmlPath = "//Users/murray/Documents/work/codeResource/ideaWorkSpace/learningOneself/SpringResourceZhuShi/springframework5.2.0.release/springdemo/src/main/java/com/imooc/service/WelcomeService.java";
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
//		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
//		welcomeService.sayHello("强大的spring框架");


		/**
		 * 获取User5Bean实例
		 */
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
//		String [] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for (String beanDefinitionName : beanDefinitionNames){
//			System.out.println(">>>>>>>"+beanDefinitionName);
//		}
//
//		WelcomeController welcomeController = (WelcomeController)applicationContext.getBean("welcomeController");
//		welcomeController.handleRequest();
//		User user5 = (User) applicationContext.getBean("user5");
//		System.out.println("CustomizedBeanDefinitionRegistryPostProcessor创建的对象:" +user5);

		/*
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		HiService hiService = (HiService)applicationContext.getBean("hiServiceImpl");
		hiService.sayHi();
		System.out.println("---------------------------分割线以下执行HelloService-------------------------------");
		HelloService helloService = (HelloService)applicationContext.getBean("helloServiceImpl");
		helloService.sayHello();*/

		// 测试Import元注解
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		OutSide outSide = (OutSide)applicationContext.getBean("com.imooc.aspect.OutSide");
		outSide.say();

		// 测试JDK动态代理
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
//		HiService hiService = (HiService)applicationContext.getBean("hiService");
//		hiService.sayHi();
//		System.out.println(">>>>>>>>>>>>>>>>>>>分割线一下执行 HelloService>>>>>>>>>>>>>>>>>>>>>>>");
//		HelloService helloService = (HelloService)applicationContext.getBean("helloService");
//		helloService.sayHello();




	}
}
