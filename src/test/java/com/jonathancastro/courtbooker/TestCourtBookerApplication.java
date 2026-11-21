package com.jonathancastro.courtbooker;

import org.springframework.boot.SpringApplication;

public class TestCourtBookerApplication {

	public static void main(String[] args) {
		SpringApplication.from(CourtBookerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
