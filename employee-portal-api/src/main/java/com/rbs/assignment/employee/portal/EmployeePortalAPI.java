package com.rbs.assignment.employee.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Main application class to launch spring boot Application.
 * 
 * @author rohit
 *
 */
@SpringBootApplication
public class EmployeePortalAPI {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePortalAPI.class, args);
	}
	
	@Bean
    public WebMvcConfigurer corsConfigurer() 
    {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
}
