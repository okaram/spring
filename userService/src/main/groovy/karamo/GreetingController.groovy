package karamo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class GreetingController {

	    
	private static final String template = "Hello, %s!";	    
	private final AtomicLong counter = new AtomicLong();

			    
	@RequestMapping("/greeting")			    
	public @ResponseBody Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {					        
		return new Greeting(counter.incrementAndGet(),String.format(template, name));								    
	}
}
