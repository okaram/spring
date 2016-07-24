package karamo

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	UserRepository repo;

	@RequestMapping("/addUser")                        
	public @ResponseBody addUser(@RequestParam("username") String username, @RequestParam("password") String password)
	{
		User u=new User();
		u.username=username;
		u.setPassword(password);

		repo.save(u);
	}	
	
	@RequestMapping("/validateLogin")
	public @ResponseBody validateLogin(@RequestParam("username") String username, @RequestParam("password") String password)
	{
		List<User> u=repo.findByUsername(username);
		return !u.isEmpty() && u[0].password==password;	
	}

}
	
