Spring Boot Cheatsheet

## Gradle dependencies

+ compile("org.springframework.boot:spring-boot-starter-web")
+ compile("org.springframework.boot:spring-boot-starter-actuator")
+ compile("org.springframework.boot:spring-boot-starter-data-jpa")
+ compile("com.h2database:h2")
+ testCompile('org.springframework.boot:spring-boot-starter-test')

## Controllers (actuator)
```java
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
```

### Example
```java
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Greeting sayHello(
	@RequestParam(value="name", required=false, defaultValue="Stranger") 	String name){
	}
}
```
## Entities (JPA)

## Repositories (JPA)

## Testing

## Other annotations

## Feign

