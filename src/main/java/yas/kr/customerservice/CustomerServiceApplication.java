package yas.kr.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import yas.kr.customerservice.entities.Customer;
import yas.kr.customerservice.repository.CustomerRepository;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);

	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
					customerRepository.save(new Customer(null,"Yassine","Yassine@karimi.com"));
					customerRepository.save(new Customer(null,"Med","Med@karimi.com"));
					customerRepository.save(new Customer(null,"Layla","Layla@karimi.com"));
					customerRepository.findAll().forEach(c->{
						System.out.println(c.toString());
					});
		};
	}

}
