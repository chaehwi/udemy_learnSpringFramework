package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record 는 jdk16에서 추가된 새로운 기능
// Java Bean 을 만드는 번거로움을 없애기 위해 도입된 기능
// record 를 사용하면 세터 게터 생성자 등을 만들 필요가 없음. 자동 생성.
record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Ranga";
	}

	@Bean
	public int age() {
		return 15;
	}

	@Bean
	public Person person() {
		return new Person("Ravi", 20, address());
	}

	// 기존 스프링 bean 과 관계가 있는 새로운 bean 만들기
	// 1. 메서드 호출 방법
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}

	// 2. 매개 변수 방법
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);
	}

	@Bean(name = "address2") // Bean 의 이름을 사용자 지정할 수 있음
	public Address address() {
		return new Address("Suyeong", "Busan");
	}

	@Bean(name = "address3") // Bean 의 이름을 사용자 지정할 수 있음
	public Address address3() {
		return new Address("Suyeong3", "Busan3");
	}
}
