package com.demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableMongoRepositories(basePackages = "com.demo.domain.repository")
@ComponentScan(basePackages = {"com.demo.cronjob", "com.demo.domain", "com.demo.infra"})
@ConfigurationPropertiesScan(
    basePackages = {"com.demo.cronjob", "com.demo.domain", "com.demo.infra"})
public class CronJobApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(CronJobApplication.class).web(WebApplicationType.NONE).run(args);
  }
}
