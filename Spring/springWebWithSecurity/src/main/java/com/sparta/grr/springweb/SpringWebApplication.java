package com.sparta.grr.springweb;

import com.sparta.grr.springweb.entities.User;
import com.sparta.grr.springweb.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository userRepository, PasswordEncoder passwordEncoder){
		return args -> {
			if(userRepository.findAll().isEmpty()){
				userRepository.save(new User("admin", passwordEncoder.encode("password"), "ROLE_ADMIN,ROLE_USER"));
				userRepository.save(new User("user", passwordEncoder.encode("password"), "ROLE_USER"));
			}
		};
	}

}
