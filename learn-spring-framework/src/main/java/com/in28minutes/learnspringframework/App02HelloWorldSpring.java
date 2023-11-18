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
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));

		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("address3"));

//		System.out.println(context.getBean(Address.class)); // Bean 의 유형은 Bean 의 Bean, 일치하는 것이 두 개(address2,address3)
		// 스프링이 Bean 을 관리하기 시작하면 Bean 의 이름을 사용하거나 유형을 사용해 검색 및 이용 가능

	}

}
