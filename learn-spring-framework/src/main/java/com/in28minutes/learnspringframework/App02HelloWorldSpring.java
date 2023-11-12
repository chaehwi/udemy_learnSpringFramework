package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1. 스프링 Context 실행

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// 2. 스프링 프레임워크가 관리하도록 하기 - @Configuration
		// HelloWorldConfiguration - @Configuration
		// name - @Bean

		// 3. 스프링이 관리하는 Bean 을 검색
		System.out.println(context.getBean("name"));
		
	}

}
