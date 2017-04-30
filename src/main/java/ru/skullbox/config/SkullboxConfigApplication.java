package ru.skullbox.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SkullboxConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkullboxConfigApplication.class, args);
	}
}
