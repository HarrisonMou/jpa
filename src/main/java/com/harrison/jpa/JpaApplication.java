package com.harrison.jpa;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
@EnableCaching
@EnableRabbit
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(ApplicationContext ac){
		return (args) ->{
			System.out.println("来看看 SpringBoot 默认为我们提供的 Bean：");
			String[] beanNames = ac.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			Arrays.stream(beanNames).forEach(System.out::println);
		};
	}
}
