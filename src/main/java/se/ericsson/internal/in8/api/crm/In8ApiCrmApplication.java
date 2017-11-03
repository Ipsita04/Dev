package se.ericsson.internal.in8.api.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
@ComponentScan("se.ericsson.internal.in8")
public class In8ApiCrmApplication {
  
  public In8ApiCrmApplication() {
  }

  public static void main(String[] args) {
    SpringApplication.run(In8ApiCrmApplication.class, args);
  }

}