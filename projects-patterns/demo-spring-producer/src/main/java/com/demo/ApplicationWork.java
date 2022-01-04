package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.demo.work", "com.demo.core"})
@ConfigurationPropertiesScan(basePackages = {"com.demo.work", "com.demo.core"})
public class ApplicationWork {

  public static void main(String[] args) {
    SpringApplication.run(ApplicationWork.class, args);
  }
}
