package okaram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.*;

@Configuration
public class SpanishConfig {
	@Bean
	String message() { return "Hola mundo";}
}


//@Configuration
//@ComponentScan
public class App1 {

	public static void main(String[] args) {
		GenericGroovyApplicationContext context = 
			new GenericGroovyApplicationContext();
		context.reader.beans {
			message (String, "Hola mundo");
		}
		context.refresh();
		String message = context.getBean("message",String.class);
		System.out.println("Message="+message);
		
	}
}
