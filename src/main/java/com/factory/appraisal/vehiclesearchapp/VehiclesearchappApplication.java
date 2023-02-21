package com.factory.appraisal.vehiclesearchapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/*import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;*/

//@EnableElasticsearchRepositories(basePackages = "com.factory.appraisal.vehiclesearchapp.repository")
@ComponentScan(basePackages = { "com.factory.appraisal.vehiclesearchapp" })
@SpringBootApplication
public class VehiclesearchappApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiclesearchappApplication.class, args);
	}

}
