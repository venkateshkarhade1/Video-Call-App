package com.venkatesh.Videocall.App;

import com.venkatesh.Videocall.App.Model.User;
import com.venkatesh.Videocall.App.Service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
					.username("venkatesh")
					.email("venkatesh@gmail.com")
					.password("venkatesh")
					.build());

			service.register(User.builder()
					.username("Atharva")
					.email("atharva@gmail.com")
					.password("atharva")
					.build());

			service.register(User.builder()
					.username("rahul")
					.email("rahul@gmail.com")
					.password("rahul")
					.build());
		};
	}

}
