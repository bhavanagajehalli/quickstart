package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Restaurant;
import com.example.demo.ifaces.RestaurantRepository;
import com.example.demo.service.RestaurntService;

@SpringBootApplication
public class RestaurantServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(RestaurantServiceApplication.class, args);
		RestaurntService service=ctx.getBean(RestaurntService.class);
		int key=7;
		switch (key) {
		case 1:
			service.findAll().forEach(System.out::println);
			break;
		case 2:
			System.out.println(service.findById(2030));
			break;
		case 3:
			System.out.println(service.remove(2030));
			break;
		case 4:
			Restaurant objToUpdate=ctx.getBean("updateBean",Restaurant.class);
			System.out.println(service.update(objToUpdate));
			break;
		case 5:
			service.findByName("Adigas").forEach(System.out::println);
			break;
		case 6:
			service.fetchUsingLocation("Manglore").forEach(System.out::println);
			break;
		case 7:
		    System.out.println("number of rows updated" +service.updateRating(9030,4.2));
		    break;
		case 8:
		    service.fetchUsingRating(4.9).forEach(System.out::println);
		    break;

		default:
			break;
		}
		//ctx.getBean(RestaurntService.class).findAll().forEach(System.out::println);
		
		
	  //  System.out.println(service.findById(2030));
	   // System.out.println(service.findById(3030));
		
		}
	@Bean
	public Restaurant updateBean() {
		return new Restaurant(4030, "Geetham", "Adoni", 4.1, LocalDate.of(2006, 9, 29));
	}
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			RestaurantRepository repo;
			@Override
			public void run(String... args) throws Exception {
				repo.save(new Restaurant(4030, "Sangeetha", "Adoni", 4.9, LocalDate.of(2005, 9, 23)));
				repo.save(new Restaurant(5030, "Adigas", "Manglore", 4.0, LocalDate.of(2011, 9, 23)));
			}
		};
	}

}
