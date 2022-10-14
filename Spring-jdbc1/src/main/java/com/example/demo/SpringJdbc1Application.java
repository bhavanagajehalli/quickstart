package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringJdbc1Application.class, args);
		int key=2;
		CustomerService service =ctx.getBean(CustomerService.class);
		if(key==1) {
		Customer obj=ctx.getBean(Customer.class);
		obj.setCustomerid(Integer.parseInt(args[1]));
		obj.setCustomername(args[2]);
		obj.setEmail(args[3]);
		//CustomerService service=ctx.getBean(CustomerService.class);
		System.out.println("Is Added:= "+service.save(obj));
		}
		if(key==2) {
			service.findAll().forEach(System.out::println);
		}
		ctx.close();
	}

}
