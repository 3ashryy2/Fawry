package software.fawry_services;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import software.fawry_services.View.AdminConfig;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext test =SpringApplication.run(DemoApplication.class, args);
		AdminConfig admin=test.getBean(AdminConfig.class);
	}

}
