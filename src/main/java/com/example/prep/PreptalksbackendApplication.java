package com.example.prep;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@EnableSwagger2
public class PreptalksbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreptalksbackendApplication.class, args);
	}
		@Bean
	public WebMvcConfigurer configure() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry reg) {
				reg.addMapping("/**").allowedOrigins("*");
			}
		};
	}
	// @Bean
	// public org.springframework.web.filter.CorsFilter corsFilter() {
	// 	CorsConfiguration corsConfiguration = new CorsConfiguration();
	// 	corsConfiguration.setAllowCredentials(true);
	// 	corsConfiguration.setAllowedOrigins(Arrays.asList("https://jaimahadeva.github.io",  "http://localhost:4200","https://jaimahadeva.github.io/", "https://jaimahadeva.github.io/jsr/","https://prepshopbackend.onrender.com"));
	// 	corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
	// 			"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
	// 			"Access-Control-Request-Method", "Access-Control-Request-Headers"));
	// 	corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
	// 			"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
	// 	corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
	// 	UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
	// 	urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
	// 	return new CorsFilter(urlBasedCorsConfigurationSource);
	// }
//	@Bean
//	   public Docket productApi() {
//	      return new Docket(DocumentationType.SWAGGER_2).select()
//	         .apis(RequestHandlerSelectors.basePackage("com.example.prep")).build();
//	   }

	public Docket SwaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}
}

