package org.am.springbootrestjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;

/**
 * exclude = RepositoryRestMvcAutoConfiguration.class - disables RepositoryRestHandlerMapping
 */
@SpringBootApplication(exclude = RepositoryRestMvcAutoConfiguration.class)
public class SpringBootRestJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestJpaApplication.class, args);
	}
}
