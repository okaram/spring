package karamo

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
@groovy.transform.CompileStatic
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/addUser")                        
	public @ResponseBody addUser(@RequestParam("username") String username, @RequestParam("password") String password)
	{
		userService.addUser(username,password);
	}	
	
	@RequestMapping("/validateLogin")
	public @ResponseBody validateLogin(@RequestParam("username") String username, @RequestParam("password") String password)
	{
		return userService.validateLogin(username,password);
	}

}
	
