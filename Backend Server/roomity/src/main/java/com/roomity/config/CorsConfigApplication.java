package com.roomity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfigApplication implements WebMvcConfigurer {
	
	public void addCorsMapping(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("*");
	}

}
