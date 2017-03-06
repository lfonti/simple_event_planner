package ch.fhnw.edu.eaf.moviemgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MoviemanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviemanagementApplication.class, args);
	}
}
