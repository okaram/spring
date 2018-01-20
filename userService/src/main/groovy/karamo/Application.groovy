package karamo

import karamo.db.UrlRedirectDBImpl
import karamo.db.UserServiceDBImpl
import karamo.serviceInterfaces.UrlRedirectService
import karamo.serviceInterfaces.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Application {    
	public static void main(String[] args) {	        
		SpringApplication.run(Application.class, args);				    
	}

	@Bean
	UserService userService() {
		return new UserServiceDBImpl();
	}
	@Bean
	UrlRedirectService urlRedirectService() {
		return new UrlRedirectDBImpl();
	}
}
